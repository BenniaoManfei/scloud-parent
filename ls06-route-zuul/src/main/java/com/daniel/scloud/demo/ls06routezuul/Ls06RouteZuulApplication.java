package com.daniel.scloud.demo.ls06routezuul;

import com.daniel.scloud.demo.zuulFilter.MyFilter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Ls06RouteZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ls06RouteZuulApplication.class, args);
	}

	/**
	 * 自定义路由策略
	 *
	 * @description <>
	 *
	 * @param
	 * @return com.netflix.zuul.ZuulFilter
	 *
	 * @since marketing-2.0
	 * @Author DaiZM
	 * @Date  2017/12/15
	 */
	@Bean
	public ZuulFilter zuulFilter() {

		return new MyFilter();
	}
}
