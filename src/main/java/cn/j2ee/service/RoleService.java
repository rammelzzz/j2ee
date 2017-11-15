package cn.j2ee.service;

import cn.j2ee.entity.Role;

/**
 * Created by Rammus on 2017/10/17.
 */
public interface RoleService {

    /**
     * 根据username获取对应角色
     * @param username
     * @return
     */
    public Role getRole(String username);

}
