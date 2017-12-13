package com.daniel.scloud.demo.ls06mssms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ls06MsSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls06MsSmsApplication.class, args);
	}
}
