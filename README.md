# scloud-parent

> 用来进行springCloud学习的一个测试项目

#### 1. Eureka ####

1. 新建sms微服务(未添加到注册中心)

2. 新建注册中心项目(eureka),并将sms微服务注册到注册中心


----

#### 3. Ribbon ####

1. 使用RestTemplate和Ribbon完成客户端负载调用


----

#### 4. Feign+Ribbon ####

1. 使用Feign完成服务之间的调用
2. website-feign中增加了一个radom配置，更改Ribbon默认负载策略(轮询)为随机


----