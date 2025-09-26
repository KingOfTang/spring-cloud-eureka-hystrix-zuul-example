package com.techprimers.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 启用熔断器功能注解
 *
 * 该注解用于开启Spring Cloud的熔断器支持，通常标记在Spring Boot应用的主配置类上。
 * 启用后可以使用Hystrix等熔断器组件来实现服务降级、熔断等容错机制。
 *
 * 注意：此注解需要配合具体的熔断器实现（如Hystrix）相关依赖才能正常工作
 */
@EnableCircuitBreaker

@EnableDiscoveryClient
@SpringBootApplication
public class HelloClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
}


/**
 * 配置类，用于创建和配置应用程序的bean
 */
@Configuration
class Config {

	/**
	 * 创建并配置一个支持负载均衡的RestTemplate bean
	 *
	 * @return 配置好的RestTemplate实例，支持负载均衡功能
	 */
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}


}