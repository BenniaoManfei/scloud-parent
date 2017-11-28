package com.daniel.scloud.demo.ls02discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ls02DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls02DiscoveryEurekaApplication.class, args);
	}
}
