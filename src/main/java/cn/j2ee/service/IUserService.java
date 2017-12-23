package cn.j2ee.service;

import cn.j2ee.entity.User;
import cn.j2ee.response.ServerResponse;
import com.sun.corba.se.spi.activation.Server;
import org.springframework.ui.Model;

import java.util.List;

/**
 * Created by Rammus on 2017/10/16.
 */
public interface IUserService {

    /**
     * 检查username是否存在及password正确性
     * @param username
     * @return
     */
    public int checkUser(String username);

    /**
     * 获取角色
     * @param username
     * @param password
     * @return
     */
    public User getUser(String username, String password);

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 显示所有用户
     * @return
     */
    public List<User> listUsers();

    /**
     * 修改用户的状态
     * @param user_id
     * @param status
     * @return
     */
    public ServerResponse changeStatus(int user_id, int status);
}
