
package com.daniel.scloud.demo.ls06mssms.dao;

import com.daniel.scloud.demo.ls06mssms.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
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
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
