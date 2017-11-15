package cn.j2ee.exception;

/**
 * Created by Rammus on 2017/10/16.
 */
public class UserNotExistException extends Exception{

    private static final String msg = "User not exist!";

    public UserNotExistException() {
        super(msg);
    }

}
