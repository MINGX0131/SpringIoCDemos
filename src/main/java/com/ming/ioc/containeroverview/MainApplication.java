package com.ming.ioc.containeroverview;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ming.ioc.containeroverview.config.AppConfig;
import com.ming.ioc.containeroverview.service.PetStoreServiceImpl;

public class MainApplication {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
        
//       AccountDao accountDao = new JpaAccountDao();
//        ItemDao itemDao = new JpaItemDao();
          
//        PerStoreServiceImpl pertStoreService = new PetStoreServiceImpl();
//          pertStoreService.
    }
}

