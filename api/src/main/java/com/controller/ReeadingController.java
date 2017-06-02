package com.controller;

import com.model.Reading;
import com.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vinod on 5/26/2017.
 */
@RestController
public class ReeadingController {


    @Autowired
    ReadingService readingService;

    @CrossOrigin(origins = "http://mocker.egen.io")
    @RequestMapping(method= RequestMethod.POST, value="/readings")
    public String vehicleReadings(@RequestBody Reading readings){
        readingService.addAllReadings(readings);
        return "Readings Saved";
    }
}
