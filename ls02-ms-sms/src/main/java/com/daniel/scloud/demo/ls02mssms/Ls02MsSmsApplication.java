package com.daniel.scloud.demo.ls02mssms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ls02MsSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls02MsSmsApplication.class, args);
	}
}
