package com.techprimers.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
/**
 * 启用Zuul代理功能
 *
 * 该注解用于开启Spring Cloud Zuul的代理功能，将当前应用配置为API网关。
 * 启用后，应用将具备路由转发、负载均衡、过滤器执行等网关核心功能。
 *
 * 主要功能包括：
 * - 自动配置Zuul的路由规则
 * - 启用请求路由和转发机制
 * - 激活Zuul的过滤器链处理
 * - 集成服务发现和负载均衡能力
 */
@EnableZuulProxy

@SpringBootApplication
public class ZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServiceApplication.class, args);
	}
}
