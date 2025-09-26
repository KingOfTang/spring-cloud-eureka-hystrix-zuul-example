package com.techprimers.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启用服务发现客户端功能
 *
 * 该注解用于标记一个应用作为服务发现的客户端，使其能够注册到服务注册中心
 * 并发现其他服务实例。通常与Spring Cloud的注册中心（如Eureka、Consul等）配合使用。
 *
 * 使用此注解后，应用将自动配置服务注册与发现相关的组件，包括：
 * - 服务注册：将自身信息注册到注册中心
 * - 服务发现：从注册中心获取其他服务的实例信息
 * - 心跳检测：定期向注册中心发送心跳以维持服务状态
 *
 * 注意：需要配合相应的注册中心依赖和配置才能正常工作
 */
@EnableDiscoveryClient

@SpringBootApplication
public class HelloServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServerApplication.class, args);
	}
}


