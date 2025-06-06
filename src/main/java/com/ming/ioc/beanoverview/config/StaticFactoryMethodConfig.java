package com.ming.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ming.ioc.beanoverview.service.ClientService;

@Configuration
public class StaticFactoryMethodConfig {

    @Bean
    public ClientService clientService() {
        return ClientService.createInstance(); // 정적 팩토리 메서드 호출
    }
}