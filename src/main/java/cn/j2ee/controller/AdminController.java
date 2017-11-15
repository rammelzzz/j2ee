package cn.j2ee.controller;

import cn.j2ee.entity.User;
import cn.j2ee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Rammus on 2017/10/21.
 */
@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin-add.do", method = RequestMethod.POST)
    public String adminAdd(User user, String password2, String sex, String role, Model model) {
        boolean isMan = false;
        if(sex.equals("男")) isMan = true;
        if(userService.getUser(user.getUsername()) != null) {
            model.addAttribute("errorMsg", "Username has exist!");
            return "admin-add";
        }
        return "admin-list";
    }

    @RequestMapping(value = "/admin-add.do", method = RequestMethod.GET)
    public String adminAdd() {
        return "admin-add";
    }
}
