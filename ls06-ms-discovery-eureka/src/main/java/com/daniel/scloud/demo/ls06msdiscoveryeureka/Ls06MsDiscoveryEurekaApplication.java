package com.daniel.scloud.demo.ls06msdiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Ls06MsDiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls06MsDiscoveryEurekaApplication.class, args);
	}
}
