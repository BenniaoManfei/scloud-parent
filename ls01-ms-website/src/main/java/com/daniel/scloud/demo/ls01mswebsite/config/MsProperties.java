
package com.daniel.scloud.demo.ls01mswebsite.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 微服务集合
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
@Setter
@Getter
@ToString
@Configuration
@ConfigurationProperties(prefix = "ms")
@PropertySource(
        "classpath:/ms.properties"
)
public class MsProperties {
    
    private String sms;

    private String website;

}
