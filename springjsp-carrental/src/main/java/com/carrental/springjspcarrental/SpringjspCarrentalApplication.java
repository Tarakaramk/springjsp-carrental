package com.carrental.springjspcarrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.carrental.springjspcarrental")
public class SpringjspCarrentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjspCarrentalApplication.class, args);
	}

}
