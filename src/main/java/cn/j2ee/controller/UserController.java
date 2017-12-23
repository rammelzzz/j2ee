package cn.j2ee.controller;

import cn.j2ee.entity.User;
import cn.j2ee.response.ServerResponse;
import cn.j2ee.service.IUserService;
import cn.j2ee.utils.Constant;
import cn.j2ee.utils.StringUtil;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by rammel on 2017/11/27.
 * User 即是管理员
 */
@Controller
@RequestMapping(value = "/user/")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public String login(String username, String password, String verCode, HttpSession session, Model model) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String verifyCode = (String)session.getAttribute("verCode");
        if(!StringUtil.isSame(verCode, verifyCode)) {
            session.setAttribute(Constant.ERROR, Constant.VERIFY_CODE_ERROR);
            return Constant.LOGIN;
        }
        if(userService.checkUser(username) > 0) {
            User user = userService.getUser(username, StringUtil.EncoderMd5Password(password));
            //如果user为空则表示用户名存在然而密码不正确
            if(user == null) {
                session.setAttribute(Constant.ERROR, Constant.PASSWORD_ERROR);
                return Constant.LOGIN;
            }
            //用户存在且密码正确将其放在session中返回主界面
            session.setAttribute("user", user);
            return Constant.INDEX;
        } else {
            //此时表明用户不存在
            session.setAttribute("errorMsg", Constant.USER_NOT_EXIST);
            return Constant.LOGIN;
        }
    }

    @RequestMapping(value = "admin-add.do", method = RequestMethod.POST)
    public String addUser(User user, HttpSession session, Model model) {
        if(user == null) {
            return "admin-list";
        }
        if(userService.checkUser(user.getUsername()) > 0) {
            model.addAttribute(Constant.ERROR, Constant.USER_EXIST);
        } else {
            try {
                userService.addUser(user);
                //添加成功，向前台返回添加成功信息
                model.addAttribute(Constant.ERROR, Constant.SUCCESS);
            } catch (Exception e) {
                model.addAttribute(Constant.ERROR, Constant.DATABASE_ERROR);
            }
        }
        return "admin-list";
    }

    @RequestMapping(value = "changeStatus.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse changeStatus(int status, int user_id) {
        return null;
    }


}
