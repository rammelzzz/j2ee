package cn.j2ee.service.impl;

import cn.j2ee.entity.Permission;
import cn.j2ee.entity.Role;
import cn.j2ee.mapper.PermissionMapper;
import cn.j2ee.service.PermissionService;
import cn.j2ee.utils.LoggerUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rammus on 2017/10/17.
 */
@Service("permissionService")
public class PermissionServiceImpl  extends BasicServiceImpl implements PermissionService{

    public List<Permission> getPermission(Role role) {
        ArrayList<Permission> list = null;
        PermissionMapper permissionMapper = sqlSession.getMapper(PermissionMapper.class);
        try {
            list = (ArrayList<Permission>) permissionMapper.getPermissions(role);
        } catch (Exception e) {
            LoggerUtil.error(this.getClass(), "DataBase error", e);
            return null;
        }
        return list;
    }

}
