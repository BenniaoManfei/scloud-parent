package com.daniel.scloud.demo.ls01mswebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ls01MsWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls01MsWebsiteApplication.class, args);
	}
}
