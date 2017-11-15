package cn.j2ee.service.impl;

import cn.j2ee.entity.Role;
import cn.j2ee.mapper.RoleMapper;
import cn.j2ee.service.RoleService;
import cn.j2ee.utils.LoggerUtil;
import org.springframework.stereotype.Service;

/**
 * Created by Rammus on 2017/10/17.
 */
@Service("roleService")
public class RoleServiceImpl extends BasicServiceImpl implements RoleService{


    /**
     * 根据username获取相应角色
     * @param username
     * @return
     */
    public Role getRole(String username) {
        Role role = null;
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        try{
            role = roleMapper.getRole(username);
        }catch (Exception e) {
            LoggerUtil.databaseError(this.getClass(), e);
            return role;
        }
        return null;
    }
}
