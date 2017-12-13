package com.daniel.scloud.demo.ls05mssms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ls05MsSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls05MsSmsApplication.class, args);
	}
}
