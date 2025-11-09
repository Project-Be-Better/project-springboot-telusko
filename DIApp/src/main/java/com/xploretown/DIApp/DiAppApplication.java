package com.xploretown.DIApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(DiAppApplication.class, args);

		Dev dev = applicationContext.getBean(Dev.class);
		dev.build();

	}

}
