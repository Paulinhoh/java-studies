package com.example.first_spring_app.configuration;

import com.example.first_spring_app.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }
}
