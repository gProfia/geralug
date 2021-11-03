package com.app.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppJavaConfig {
    
    // DTO package configuration:
    // modelmapper: entity <-> dto
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    // CONTROLLER package configuration:
    // MODEL package configuration:
    // REPOSITORY package configuration:
    // SECURITY package configuration:
    // SERVICE package configuration:

}
