package com.daniel.scloud.demo.ls01discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ls01DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls01DiscoveryEurekaApplication.class, args);
	}
}
