package com.controller;

import com.model.Reading;
import com.model.Vehicle;
import com.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vinod on 5/19/2017.
 */
@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method= RequestMethod.PUT,value="/vehicles")
    public String vehicleDetails(@RequestBody Vehicle[] vehicle){
       String result = vehicleService.addVehilceInfo(vehicle);
        return result;
    }



}
