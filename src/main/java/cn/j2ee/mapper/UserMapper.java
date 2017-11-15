package cn.j2ee.mapper;

import cn.j2ee.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Rammus on 2017/10/16.
 */
public interface UserMapper {

    /**
     * 根据用户名获取User对象
     * @param username
     * @return
     */
    public User getUser(String username);


}
