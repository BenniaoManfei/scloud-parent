package com.daniel.scloud.demo.ls04mssms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ls04MsSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls04MsSmsApplication.class, args);
	}
}
