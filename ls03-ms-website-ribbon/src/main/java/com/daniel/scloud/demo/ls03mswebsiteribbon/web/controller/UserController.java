package com.daniel.scloud.demo.ls03mswebsiteribbon.web.controller;

import com.daniel.scloud.demo.ls03mswebsiteribbon.config.MsProperties;
import com.daniel.scloud.demo.ls03mswebsiteribbon.model.entity.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private MsProperties ms;

    @GetMapping("")
    public List<User> findAll() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka(ms.getSms(),false);
        String url = instance.getHomePageUrl()+"/user";
        logger.info("findAll(logged by DaiZM):<>【url:{}】",url );
        List<User> users = new RestTemplate().getForObject(url,List.class);

        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        List<ServiceInstance> instances =  discoveryClient.getInstances(ms.getSms());

        ServiceInstance instance = instances.get(0);

        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id;

        User user = new RestTemplate().getForObject(url,User.class);

        return user;
    }



}
