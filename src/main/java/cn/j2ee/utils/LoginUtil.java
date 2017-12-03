package cn.j2ee.utils;

import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

/**
 * Created by rammel on 2017/12/3.
 */
public class LoginUtil {

    private static final Object NULL = null;

    public static String isLogin(HttpSession session, String url) {
        Object o = session.getAttribute("user");
        if(o == NULL) {
            session.setAttribute(Constant.ERROR, Constant.NEED_LOGIN);
            return Constant.LOGIN;
        } else {
            return url;
        }
    }

    public static boolean isLogin(HttpSession session) {
        Object o = session.getAttribute("user");
        return !(o == NULL);
    }

    public static String needLogin(Model model) {
        model.addAttribute(Constant.ERROR, Constant.NEED_LOGIN);
        return Constant.LOGIN;
    }
}
