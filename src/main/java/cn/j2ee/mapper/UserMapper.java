package cn.j2ee.mapper;

import cn.j2ee.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Rammus on 2017/10/16.
 */
@Repository
public interface UserMapper {

    /**
     * 根据用户名获取User对象
     * @param username
     * @return
     */
    public User getUser(String username, String password);

    public int checkUser(String username);

    public void addUser(User user);

    public List<User> listUsers();
}
