package com.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by vinod on 5/19/2017.
 */
@Configuration
@ComponentScan(basePackages = "com.*")
@EntityScan(basePackages = "com.model")
@PropertySource("classpath:message.properties")
public class AppConfig {

    @Value("${Message_EngineCondition}")
    private String Message_EngineCondition;

    @Value("${Message_FuelPercentage}")
    private String Message_FuelPercentage;

    @Value("${Message_TirePressure}")
    private String Message_TirePressure;

    @Value("${Message_EngineCoolantAndLight}")
    private String Message_EngineCoolantAndLight;

    @Value("${Priority1}")
    private String Priority1;

    @Value("${Priority2}")
    private String Priority2;

    @Value("${Priority3}")
    private String Priority3;


    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }



}
