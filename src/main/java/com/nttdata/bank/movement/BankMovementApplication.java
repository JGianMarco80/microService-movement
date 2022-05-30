package com.nttdata.bank.movement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableReactiveFeignClients
public class BankMovementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankMovementApplication.class, args);
	}

}
