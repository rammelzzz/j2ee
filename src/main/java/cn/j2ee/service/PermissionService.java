package cn.j2ee.service;

import cn.j2ee.entity.Permission;
import cn.j2ee.entity.Role;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Rammus on 2017/10/17.
 */
public interface PermissionService {

    public List<Permission> getPermission(Role role);

}
