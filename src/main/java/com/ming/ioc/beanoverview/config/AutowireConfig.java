package com.ming.ioc.beanoverview.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ming.ioc.beanoverview.dao.AccountDao;
import com.ming.ioc.beanoverview.dao.JpaAccountDao;
import com.ming.ioc.beanoverview.service.PetStoreService;

@Configuration
public class AutowireConfig {

    @Bean
    public AccountDao accountDao() {
        return new JpaAccountDao();
    }

    @Bean
    public PetStoreService petStoreService(AccountDao accountDao) {
        PetStoreService service = new PetStoreService();
        service.setAccountDao(accountDao); // 명시적 Autowiring
        return service;
    }
}



