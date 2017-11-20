package com.daniel.scloud.demo.ls01mswebsite.web.controller;

import com.daniel.scloud.demo.ls01mswebsite.config.MsProperties;
import com.daniel.scloud.demo.ls01mswebsite.model.entity.User;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private EurekaDiscoveryClient eurekaDiscoveryClient;

    @Autowired
    private MsProperties ms;

/*    @GetMapping("")
    public List<User> findAll() {
        List<User> users =userRepository.findAll();

        return users;
    }*/

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        List<ServiceInstance> instances =  discoveryClient.getInstances(ms.getSms());

        ServiceInstance instance = instances.get(0);

        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;

        User user = new RestTemplate().getForObject(url,User.class);

        return user;
    }

}
