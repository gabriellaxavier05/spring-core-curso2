package com.gx.springcoredemo.config;

import com.gx.springcoredemo.common.Coach;
import com.gx.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") //passando um id
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
