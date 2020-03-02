package com.dawn.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * mybatis工厂
 */
public class MybatisConfig {
    // 1，创建 SqlSessionFactoryBuilder对象，（orm模型的基本概念，通过session来管理对象
    static SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    // 2，通过 Buidler对象创建 SqlSessionFactory工厂
    static SqlSessionFactory sessionFactory = builder.build(
            MybatisConfig
                    .class
                    .getResourceAsStream("/mybatis.cfg.xml")
    );
    // 4，数据操作

    public static SqlSession openSession(){
        // 3，通过工厂创建 SqlSession对象，
        SqlSession session = sessionFactory.openSession();
        return session;
    }

    /**
     * 关闭session
     * @return
     */
    public static void closeSqlSession(SqlSession session){
        // 5，开启了事务进行事务提交
        session.commit();
        // 6，关闭
        session.close();
    }
}
