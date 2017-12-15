package com.daniel.scloud.demo.ls06mswebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker//启动熔断机制
@EnableHystrixDashboard //启动HystrixDashboard的监控
public class Ls06MsWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls06MsWebsiteApplication.class, args);
	}
}
