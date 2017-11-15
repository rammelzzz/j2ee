//package cn.j2ee.shiro.token;
//
//import cn.j2ee.entity.User;
//import cn.j2ee.service.UserService;
//import cn.j2ee.utils.LoggerUtil;
//import cn.j2ee.utils.StringUtil;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Collection;
//
///**
// * Created by Rammus on 2017/10/17.
// */
//public class ShiroRealm extends AuthorizingRealm{
//
//    @Autowired
//    private UserService userService;
//
//    //获取授权信息
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String username = (String)principalCollection.fromRealm(getName()).iterator().next();
//        if( username != null) {
//            //查询用户授权信息
//
//        }
//        return null;
//    }
//
//    //获取认证信息
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        ShiroToken token = (ShiroToken) authenticationToken;
//        //通过表单接收的用户信息
//        String username = token.getUsername();
//        if(!StringUtil.isBlank(username)) {
//            User user = null;
//            try {
//                user = userService.getUser(username);
//                if(user._0 == user.getStatus()) {
//                    throw new DisabledAccountException("账号已经禁止登陆！");
//                }
//                if(user != null) {
//                    return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
//                }
//            }catch (Exception e) {
//                LoggerUtil.error(this.getClass(), "Database error!", e);
//            }
//        }
//        return null;
//    }
//}
