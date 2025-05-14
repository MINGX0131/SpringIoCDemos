package com.ming.ioc.containeroverview.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContxt.xml");
		ServerService serverService = context.getBean("serverService", ServerService.class);
		serverService.service();
		AccountService accountService = context.getBean("accountService", AccountService.class);
		accountService.login();
		
	}

}
