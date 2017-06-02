package com.service;

import com.model.Alerts;
import com.model.Reading;
import com.model.Tires;
import com.model.Vehicle;
import com.repository.AlertsRepository;
import com.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Created by vinod on 5/31/2017.
 */
@Service
@PropertySource("classpath:message.properties")
public class AlertServiceImpl implements AlertService {


    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    AlertsRepository alertsRepository;

    @Autowired
    private Environment env;


    public String checkAlerts(Reading readings) {
        Vehicle details = vehicleRepository.findOne(readings.getVin());

        if(readings.getEngineRpm()> details.getRedlineRpm()){
            checkAlerts(readings,env.getProperty("Priority1"),env.getProperty("Message_EngineCondition"));
        }
        if(readings.getFuelVolume()<(details.getMaxFuelVolume())/10){
            checkAlerts(readings, env.getProperty("Priority2"), env.getProperty("Message_FuelPercentage"));
        }
        Tires tires=readings.getTires();
        if (tires.isTirePressureValid()){
            checkAlerts(readings, env.getProperty("Priority3"), env.getProperty("Message_TirePressure"));
        }
        if(readings.isEngineCoolant()== true||readings.isCheckEngineLightOn()==true){
            checkAlerts(readings, env.getProperty("Priority3"), env.getProperty("Message_EngineCoolantAndLight"));
        }
        return "Sucess";
    }
    public String checkAlerts(Reading readings, String priority, String message ) {
        Alerts alerts= new Alerts();
        alerts.setVin(readings.getVin());
        alerts.setTimestamp(readings.getTimestamp());
        alerts.setPriority(priority);
        alerts.setMessage(message);

        alertsRepository.save(alerts);

        return "alerts saved";


    }

}
