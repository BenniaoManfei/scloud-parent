
package com.daniel.scloud.demo.ls01mswebsite.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 用户实体
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
public class User {

    private Long id;

    private String userName;

    private String password;

    private Integer sex;

    private String realName;

    private String mobile;

    private Date birthday;

}
