package com.daniel.scloud.demo.ls04discoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ls04DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls04DiscoveryEurekaApplication.class, args);
	}
}
