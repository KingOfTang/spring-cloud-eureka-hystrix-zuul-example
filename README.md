Spring Cloud Eureka、Hystrix 和 Zuul 示例

组件 eureka-service - Eureka 服务，即服务注册中心

hello-server - 将向客户端提供数据的服务

hello-client - 将通过服务注册中心（eureka-service）中的发现服务从服务器获取数据的服务

zuul-service - 网关/边缘服务，已在 Eureka 中注册，并使用 Eureka 服务将请求路由到客户端和服务器