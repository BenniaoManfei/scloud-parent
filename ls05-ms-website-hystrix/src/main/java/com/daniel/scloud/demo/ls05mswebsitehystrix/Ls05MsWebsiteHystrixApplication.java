package com.daniel.scloud.demo.ls05mswebsitehystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker//启动熔断机制
public class Ls05MsWebsiteHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls05MsWebsiteHystrixApplication.class, args);
	}
}
