package com.techprimers.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启用Eureka服务器功能
 *
 * 该注解用于标记一个Spring Boot应用作为Eureka服务注册中心服务器启动
 * 通过此注解，应用将具备服务发现和注册的能力，其他微服务可以向此服务器
 * 注册自己并发现其他服务
 *
 * 使用此注解的类通常是一个Spring Boot的主启动类，配合@SpringBootApplication
 * 注解一起使用，启动内嵌的Eureka服务器
 */
@EnableEurekaServer

@SpringBootApplication
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
