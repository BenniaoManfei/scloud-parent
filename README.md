# scloud-parent

> 用来进行springCloud学习的一个测试项目

#### 1. Eureka ####

1. 新建sms微服务(未添加到注册中心)

2. 新建注册中心项目(eureka),并将sms微服务注册到注册中心


----

#### 2. 配置中心 ####
1. Eureka服务中心

2. sms微服务

3. webisite微服务

----
#### 3. Ribbon ####

1. 使用RestTemplate和Ribbon完成客户端负载调用


----

#### 4. Feign+Ribbon ####

1. 使用Feign完成服务之间的调用
2. website-feign中增加了一个radom配置，更改Ribbon默认负载策略(轮询)为随机


----

#### 5. Hystrix ####

1. 断路器
2. Feign+Hystrix
3. RestTemplate+Rabbin+Hystrix(缺) 


----