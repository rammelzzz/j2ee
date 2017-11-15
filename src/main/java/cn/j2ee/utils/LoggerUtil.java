package cn.j2ee.utils;

import org.apache.log4j.Logger;

/**
 * Created by Rammus on 2017/10/17.
 * logger util工具类
 */
public class LoggerUtil {

    private static Logger logger;

    /**
     * error级别的日志
     * @param clazz
     * @param info
     * @param e
     */
    public static void error(Class clazz, String info, Exception e) {
        logger = Logger.getLogger(clazz);
        logger.error(info);
        e.printStackTrace();
    }

    /**
     * info级别的日志
     * @param clazz
     * @param info
     * @param e
     */
    public static void info(Class clazz, String info, Exception e) {
        logger = Logger.getLogger(clazz);
        logger.info(info);
        e.printStackTrace();
    }

    /**
     * debug级别的日志
     * @param clazz
     * @param info
     * @param e
     */
    public static void debug(Class clazz, String info, Exception e) {
        logger = Logger.getLogger(clazz);
        logger.debug(info);
        e.printStackTrace();
    }

    public static void databaseError(Class cls, Exception e) {
        logger = Logger.getLogger(cls);
        logger.error(Constant.DATABASE_ERROR);
        e.printStackTrace();
    }

}
