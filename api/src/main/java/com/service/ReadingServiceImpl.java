package com.service;

import com.model.Reading;
import com.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by vinod on 5/26/2017.
 */
@Service
public class ReadingServiceImpl implements ReadingService{


    @Autowired
    ReadingRepository readingRepository;


    @Autowired
    AlertService alertService;

    public String addAllReadings(Reading readings){
        readingRepository.save(readings);
        alertService.checkAlerts(readings);
        return "Readings Successfully Saved ";
    }
}
