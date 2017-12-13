
package com.daniel.scloud.demo.ls04mswebsitefeign.web.controller;

import com.daniel.scloud.demo.ls04mswebsitefeign.model.entity.User;
import com.daniel.scloud.demo.ls04mswebsitefeign.service.ms.MsSmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 *
 * @author DaiZM
 * @description
 * @create 2017/12/13
 * @history: <author>          <time>          <version>          <desc>
 * DaiZM             2017/12/13         marketing-2.0      created
 * @since marketing-2.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MsSmsService msSmsService;

    @GetMapping("")
    public List<User> findAll() {
        logger.info("findAll(logged by DaiZM):<>【msSmsService:{}】", msSmsService);

        List<User> users = msSmsService.findAll();

        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        logger.info("findAll(logged by DaiZM):<>【msSmsService:{}】", msSmsService);

        User user = msSmsService.getById(id);

        return user;
    }

}
