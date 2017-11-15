package cn.j2ee.service.impl;

import cn.j2ee.entity.User;
import cn.j2ee.exception.UserNotExistException;
import cn.j2ee.mapper.UserMapper;
import cn.j2ee.service.UserService;
import cn.j2ee.utils.Constant;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;


/**
 * Created by Rammus on 2017/10/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private SqlSession sqlSession;
    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * 根据用户名调用sqlSession进行数据库查询获得User对象
     * @param username
     * @param password
     * @return
     */
    public String checkUser(String username, String password, Model model) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = null;
        try {
            user = (User)userMapper.getUser(username);
            if(user == null)
                throw new UserNotExistException();
        } catch (Exception e) {
            logger.error(Constant.USER_NOT_EXIST);
            //在model中添加错误信息
            model.addAttribute("errorMsg", Constant.USER_NOT_EXIST);
            return Constant.ERROR;
        }
        boolean isTrue = checkUser(user, password);
        if(isTrue) {
            return Constant.SUCCESS;
        } else {
            logger.error(Constant.PASSWORD_ERROR);
            model.addAttribute("errorMsg", Constant.PASSWORD_ERROR);
            return Constant.ERROR;
        }
    }

    /**
     * 判断是否密码是否相同
     * @param user
     * @param password
     * @return
     */
    public boolean checkUser(User user, String password) {
        return user.getPassword().equals(password) ? true : false;
    }

    public User getUser(String username) {
        User user = null;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try {
            user = (User)userMapper.getUser(username);
            if(user == null)
                throw new UserNotExistException();
        }catch(Exception e) {
            logger.error("Database error!");
            e.printStackTrace();
            return null;
        }
        return user;
    }


}
