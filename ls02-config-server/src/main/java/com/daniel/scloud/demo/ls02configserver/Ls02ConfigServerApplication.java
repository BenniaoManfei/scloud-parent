package com.daniel.scloud.demo.ls02configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Ls02ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls02ConfigServerApplication.class, args);
	}
}
