package com.quan.events.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
@ComponentScan("com")
public class AppConfig {

    @Bean("applicationEventMulticaster")
    public ApplicationEventMulticaster makingitAsyn() {
        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster =
                new SimpleApplicationEventMulticaster();

        simpleApplicationEventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());

        return simpleApplicationEventMulticaster;
    }



}
