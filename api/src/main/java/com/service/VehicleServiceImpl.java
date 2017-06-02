package com.service;

//import com.repository.CarTrackerDao;
import com.model.Vehicle;
import com.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vinod on 5/19/2017.
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public String addVehilceInfo(Vehicle[] vehicle){

        for(Vehicle carInfo1:vehicle){
            vehicleRepository.save(carInfo1);
        }
        return "Sucessfully added vehicles data";
    }

}
