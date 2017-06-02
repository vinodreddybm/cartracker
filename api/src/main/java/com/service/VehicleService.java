package com.service;

import com.model.Reading;
import com.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vinod on 5/22/2017.
 */
public interface VehicleService {

    String addVehilceInfo(Vehicle[] carInfo);

}
