package com.daniel.scloud.demo.ls03mswebsiteribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Ls03MsWebsiteRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls03MsWebsiteRibbonApplication.class, args);
	}


	/**
	 * RestTemplate
	 *
	 * @description 使用Ribbon进行负载
	 *
	 * @param
	 * @return org.springframework.web.client.RestTemplate
	 *
	 * @since 1.0.3
	 * @Author DaiZM
	 * @Date  2017/12/6
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}
}
