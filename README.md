# spring-cloud-suite
micro service based spring cloud suite。
# 项目说明
- scs-eureka-server:服务注册中心,可以以单机、集群方式运行,推荐集群方式。
- scs-gateway:网关服务器,用于将接口暴露到外部访问,或者作为一组服务的统一出口。
- scs-restapi-consumer:普通的restapi服务,利用springMVC实现,在服务层,使用FeignClient来进行远程restapi的调用,里面融合了ribbon(负载),hystrix(熔断与降级),eureka(服务发现)的功能。
- scs-restapi-producer:最底层的微服务,提供基础服务。
# FeignClient:
- 默认实现了ribbon(负载),hystrix(熔断与降级),eureka(服务发现)功能。
- 可以选择HttpClient或者okHttp3作为连接客户端。
- ribbon配置:通过在FeignClient注解中将value值配置为被调用方的serviceId即可。
- hystrix配置:feign.hystrix.enabled来开启,同时配置hystrix.command.default对应的属性。如果需要为每个FeignClient配置相应的熔断规则,则使用hystrix.command.FeignClassName#methodSignature 来配置。
- eureka:配置eureka.client即可,指定对应的服务注册中心的地址即可。
