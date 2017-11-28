
package com.daniel.scloud.demo.ls02mssms.controller;

import com.daniel.scloud.demo.ls02mssms.dao.UserRepository;
import com.daniel.scloud.demo.ls02mssms.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 *
 * @description 
 *
 * @author DaiZM
 * @create 2017/11/20
 * @since 1.0.0
 *
 * @history:
 * <author>          <time>          <version>          <desc>
 * DaiZM             2017/11/20        1.0.0               created
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> findAll() {
        logger.info("findAll(logged by DanielDai)<>【serverPort:{}】",serverPort);
        List<User> users =userRepository.findAll();

        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        logger.info("findAll(logged by DanielDai)<>【serverPort:{}】",serverPort);
        User user = userRepository.findOne(id);
        return user;
    }
}
