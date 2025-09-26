package com.example.demoSecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSecondApplication.class, args);
	
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
