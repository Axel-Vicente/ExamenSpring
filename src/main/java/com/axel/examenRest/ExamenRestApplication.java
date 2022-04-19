package com.axel.examenRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.axel.*")
@SpringBootApplication
public class ExamenRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenRestApplication.class, args);
	}

}
