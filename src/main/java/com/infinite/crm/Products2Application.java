package com.infinite.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Products2Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Products2Application.class, args);
	}

}
