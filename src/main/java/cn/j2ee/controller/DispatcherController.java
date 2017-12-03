package cn.j2ee.controller;

import cn.j2ee.service.IUserService;
import cn.j2ee.utils.Constant;
import cn.j2ee.utils.LoginUtil;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Rammus on 2017/10/19.
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class DispatcherController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/admin-list.do")
    public String adminList(HttpSession session, Model model) {
        if(LoginUtil.isLogin(session)) {
            model.addAttribute("userList", userService.listUsers());
            return "admin-list";
        } else {
            return LoginUtil.needLogin(model);
        }
    }

    @RequestMapping(value = "/admin-add.do")
    public String addminAdd(HttpSession session) {
        return LoginUtil.isLogin(session, "admin-add");
    }
    @RequestMapping(value = "/article-add.do")
    public String articleAdd(HttpSession session) {
        return LoginUtil.isLogin(session, "article-add");
    }

    @RequestMapping(value = "/article-list.do")
    public String articleList() {
        return "article-list";
    }

    @RequestMapping(value = "/feed-back.do")
    public String feedBack() {
        return "feed-back";
    }

    @RequestMapping(value = "/index.do")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/member-add.do")
    public String memberAdd() {
        return "member-add";
    }

    @RequestMapping(value = "/member-del.do")
    public String memberDel() {
        return "member-del";
    }

    @RequestMapping(value = "/member-level.do")
    public String memberLevel() {
        return "member-level";
    }

    @RequestMapping(value = "/member-list.do")
    public String memberList() {
        return "member-list";
    }

    @RequestMapping(value = "/member-record-browse.do")
    public String memberRecordBrowse() {
        return "member-record-browse";
    }

    @RequestMapping(value = "/member-record-download.do")
    public String memberRecordDownload() {
        return "member-record-download";
    }

    @RequestMapping(value = "/member-record-share.do")
    public String memberRecordShare() {
        return "member-record-share";
    }

    @RequestMapping(value = "/member-scoreoperation.do")
    public String memberScoreOperation() {
        return "member-scoreoperation";
    }

    @RequestMapping(value = "/picture-add.do")
    public String pictureAdd() {
        return "picture-add";
    }

    @RequestMapping(value = "/picture-list.do")
    public String pictureList() {
        return "picture-list";
    }

    @RequestMapping(value = "/product-add.do")
    public String productAdd() {
        return "product-add";
    }

    @RequestMapping(value = "/product-brand.do")
    public String productBrand() {
        return "product-brand";
    }

    @RequestMapping(value = "/product-category.do")
    public String productCategory() {
        return "product-category";
    }

    @RequestMapping(value = "/product-list.do")
    public String productList() {
        return "product-list";
    }

    @RequestMapping(value = "/system-base.do")
    public String systemBase() {
        return "system-base";
    }

    @RequestMapping(value = "/system-category.do")
    public String systemCategory() {
        return "system-category";
    }

    @RequestMapping(value = "/system-log.do")
    public String systemLog() {
        return "system-log";
    }

    @RequestMapping(value = "/system-shielding.do")
    public String systemShielding() {
        return "system-shielding";
    }

    /**
     * 返回登录页面
     * @return
     */
    @RequestMapping(value = "/login.do")
    public String login() {
        return "login";
    }
}
