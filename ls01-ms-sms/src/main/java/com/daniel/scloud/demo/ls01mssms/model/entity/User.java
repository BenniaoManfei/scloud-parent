
package com.daniel.scloud.demo.ls01mssms.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
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
@Entity
@Table(name="tb_user")
@Setter
@Getter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="user_name")
    private String userName;

    private String password;

    private Integer sex;

    @Column(name="real_name")
    private String realName;

    private String mobile;

    private Date birthday;

}
