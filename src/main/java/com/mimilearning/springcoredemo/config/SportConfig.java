package com.mimilearning.springcoredemo.config;

import com.mimilearning.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SportConfig {

    @Bean("mallouli") // to configure the bean
    public SwimCoach swimCoach(){ // the bean id defaults to the method name
        return new SwimCoach();
    }
}
