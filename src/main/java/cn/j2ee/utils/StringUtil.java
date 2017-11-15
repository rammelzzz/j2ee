package cn.j2ee.utils;

/**
 * Created by Rammus on 2017/10/17.
 */
public class StringUtil {

    public static boolean isBlank(String s) {
        if(null == s || s.equals("")) {
            return true;
        }
        return false;
    }

}
