package com.daniel.scloud.demo.ls03mssms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Ls03MsSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls03MsSmsApplication.class, args);
	}

}
