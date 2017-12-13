
package com.daniel.scloud.demo.ls03mswebsiteribbon.web.controller;

import com.daniel.scloud.demo.ls03mswebsiteribbon.config.MsProperties;
import com.daniel.scloud.demo.ls03mswebsiteribbon.model.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户控制器
 *
 * @description 使用Ribbon进行负载
 *
 * @author DaiZM
 * @create 2017/12/6
 * @since marketing-1.0
 *
 * @history:
 * <author>          <time>          <version>          <desc>
 * DaiZM             2017/12/6         marketing-1.0      created
 */
@RestController
@RequestMapping("/ribbon/user")
public class UserByRibbonController {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MsProperties ms;

    @GetMapping("/")
    public List<User> findAll() {
        List<User> users = restTemplate.getForObject("http://"+ms.getSms()+"/user",List.class);

        return users;
    }
}
