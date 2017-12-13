package com.daniel.scloud.demo.ls05discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ls05DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls05DiscoveryEurekaApplication.class, args);
	}
}
