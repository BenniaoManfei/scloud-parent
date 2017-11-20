
package com.daniel.scloud.demo.ls01mssms.web.controller;

import com.daniel.scloud.demo.ls01mssms.dao.UserRepository;
import com.daniel.scloud.demo.ls01mssms.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> findAll() {
        List<User> users =userRepository.findAll();

        return users;
    }

}
