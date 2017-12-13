package com.daniel.scloud.demo.ls04mswebsitefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Ls04MsWebsiteFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls04MsWebsiteFeignApplication.class, args);
	}
}
