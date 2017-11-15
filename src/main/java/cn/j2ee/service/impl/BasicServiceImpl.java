package cn.j2ee.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Rammus on 2017/10/17.
 */
public class BasicServiceImpl {

    @Autowired
    protected SqlSession sqlSession;

}
