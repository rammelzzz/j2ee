package cn.j2ee.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Rammus on 2017/10/16.
 */
@Component
public class SqlSessionUtil extends SqlSessionDaoSupport{

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Bean(name = "sqlSession")
    public SqlSession getSqlSession() {
        return super.getSqlSession();
    }

}
