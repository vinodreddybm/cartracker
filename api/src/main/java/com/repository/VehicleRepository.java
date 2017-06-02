package com.repository;

import com.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vinod on 5/26/2017.
 */
public interface VehicleRepository extends CrudRepository<Vehicle,String> {

}
