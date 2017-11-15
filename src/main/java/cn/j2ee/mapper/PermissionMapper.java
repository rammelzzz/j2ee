package cn.j2ee.mapper;

import cn.j2ee.entity.Permission;
import cn.j2ee.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rammus on 2017/10/17.
 */
public interface PermissionMapper {

    /**
     * 根据角色用户名查找相应的权限
     * @param role
     * @return
     */
    public List<Permission> getPermissions(Role role);

}
