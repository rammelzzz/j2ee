package cn.j2ee.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Rammus on 2017/10/17.
 */
public class StringUtil {

    public static boolean isBlank(String s) {
        return null == s || s.equals("");
    }

    public static boolean isSame(String s1, String s2) {
        return s1 != null && s2 != null && s1.equals(s2);
    }

    /**
     * 对密码进行MD5加密并返回
     * @param pwd
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String EncoderMd5Password(String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //返回加密后的字符串
        return base64en.encode(md5.digest(pwd.getBytes("utf-8")));
    }
}
