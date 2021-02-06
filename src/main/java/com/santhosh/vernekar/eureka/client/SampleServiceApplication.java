package com.santhosh.vernekar.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController // Not a good practice to have @RestController on main class
public class SampleServiceApplication {

	@Value("${spring.application.name}")
	private String instance;

	@RequestMapping("/")
	public String message(){
		return "Hello from " + instance;
	}
	public static void main(String[] args) {
		SpringApplication.run(SampleServiceApplication.class, args);
	}

}
