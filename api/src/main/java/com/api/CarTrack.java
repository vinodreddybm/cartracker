package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by vinod on 5/19/2017.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repository")
public class CarTrack {

    public static void main(String[] args) {
        SpringApplication.run(CarTrack.class,args);



    }
}
