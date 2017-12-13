
package com.daniel.scloud.demo.ls04mswebsitefeign.service.ms;

import com.daniel.scloud.demo.ls04mswebsitefeign.model.entity.User;
import com.daniel.scloud.demo.outconfig.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Sms微服务接口
 *
 * @description 
 *
 * @author DaiZM
 * @create 2017/12/13
 * @since marketing-2.0
 *
 * @history:
 * <author>          <time>          <version>          <desc>
 * DaiZM             2017/12/13        marketing-2.0        created
 */
@FeignClient(name="${ms.sms}",configuration = FeignConfig.class)
public interface MsSmsService {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    List<User> findAll();

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    User getById(@PathVariable("id") Long id);
}
