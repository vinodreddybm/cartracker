package com.repository;

import com.model.Reading;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vinod on 5/26/2017.
 */
public interface ReadingRepository extends CrudRepository<Reading,Long> {
}
