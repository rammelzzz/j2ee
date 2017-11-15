package cn.j2ee.service;

import cn.j2ee.entity.Role;
import cn.j2ee.entity.User;
import org.springframework.ui.Model;

/**
 * Created by Rammus on 2017/10/16.
 */
public interface UserService {

    /**
     * 检查username是否存在及password正确性
     * @param username
     * @param password
     * @return
     */
    public String checkUser(String username, String password, Model model);

    /**
     * 获取角色
     * @param username
     * @return
     */
    public User getUser(String username);


}
