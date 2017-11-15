package cn.j2ee.mapper;

import cn.j2ee.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by Rammus on 2017/10/17.
 */
public interface RoleMapper {


    /**
     * 根据用户名查找对应的角色
     * @param username
     * @return
     */
    public Role getRole(String username);

}
