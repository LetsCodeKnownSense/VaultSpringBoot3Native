package com.knownsense.springnativevault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class AppProp {

    @Value("${test.demo}")
    private String test;
    //vault-backend/spring-native/dev



    public String getTest() {
        return test;
    }

}