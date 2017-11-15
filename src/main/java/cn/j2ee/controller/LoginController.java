package cn.j2ee.controller;

import cn.j2ee.entity.User;
import cn.j2ee.mapper.UserMapper;
import cn.j2ee.service.UserService;
import cn.j2ee.utils.Constant;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Rammus on 2017/10/16.
 */
@Controller
@RequestMapping(value = "/login.do")
public class LoginController {

    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private SqlSession sqlSession;

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String Login(String username, String password, String verCode, HttpSession session, Model model) {
        String verifyCode = (String)session.getAttribute("verCode");
        verCode = verCode.toLowerCase();
        if(!verifyCode.equals(verCode)) {
            logger.error("verCode is wrong");
            model.addAttribute("errorMsg", "Wrong verCode!Please try again!");
            return Constant.LOGIN;
        }
        if(model.containsAttribute("errorMsg")) {
            model.addAttribute("errorMsg", null);
        }
        return doLogin(username, password, model, session);
    }

    public String doLogin(String username, String password, Model model, HttpSession session) {
        String result = userService.checkUser(username, password, model);
        if(result.equals(Constant.SUCCESS)) {
            logger.info("login success");
            //将用户名保存在会话中，保证在各个页面之间传递
            session.setAttribute("username", username);
            return Constant.INDEX;
        }
        else {
            logger.error("login failed");
            return Constant.LOGIN;
        }
    }

    /**
     * 返回登录页面
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }

}
