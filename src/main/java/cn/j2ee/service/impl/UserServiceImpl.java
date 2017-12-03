package cn.j2ee.service.impl;

import cn.j2ee.entity.User;
import cn.j2ee.mapper.UserMapper;
import cn.j2ee.service.IUserService;
import cn.j2ee.utils.Constant;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;


/**
 * Created by Rammus on 2017/10/16.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    private Logger logger = Logger.getLogger(this.getClass());


    public int checkUser(String username) {
        return  userMapper.checkUser(username);
    }

    public User getUser(String username, String password) {
        User user = null;
        try {
            user = (User)userMapper.getUser(username, password);
        }catch(Exception e) {
            logger.error("Database error!");
            e.printStackTrace();
            return null;
        }
        return user;
    }


    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public List<User> listUsers() {
        return userMapper.listUsers();
    }


}
