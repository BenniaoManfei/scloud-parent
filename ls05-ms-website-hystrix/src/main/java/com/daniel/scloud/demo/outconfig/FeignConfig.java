
package com.daniel.scloud.demo.outconfig;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign的日志级别
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
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
