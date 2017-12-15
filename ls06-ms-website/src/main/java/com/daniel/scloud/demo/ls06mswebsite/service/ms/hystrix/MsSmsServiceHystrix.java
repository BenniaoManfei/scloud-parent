
package com.daniel.scloud.demo.ls06mswebsite.service.ms.hystrix;

import com.daniel.scloud.demo.ls06mswebsite.model.entity.User;
import com.daniel.scloud.demo.ls06mswebsite.service.ms.MsSmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 短信微服务的熔断处理
 *
 * @description 
 *
 * @author DaiZM
 * @create 2017/12/13
 * @since marketing-2.0
 *
 * @history:
 * <author>          <time>          <version>          <desc>
 * DaiZM             2017/12/13         marketing-2.0      created
 */
@Component
public class MsSmsServiceHystrix implements MsSmsService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public List<User> findAll() {
        logger.info("findAll(logged by DaiZM):<启动熔断机制~~>【】" );
        return null;
    }

    @Override
    public User getById(Long id) {
        logger.info("getById(logged by DaiZM):<启动熔断机制~~>【】" );
        return null;
    }
}
