package com.dawn.dao.impl;

import com.dawn.config.MybatisConfig;
import com.dawn.dao.UserDao;
import com.dawn.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class UserDaoImpl implements UserDao {


    public void add(User user) {
        // 3，通过工厂创建 SqlSession对象，
        SqlSession sqlSession = MybatisConfig.openSession();
        sqlSession.insert("com.dawn.dao.UserDao.add", user);
        MybatisConfig.closeSqlSession(sqlSession);
    }

    public void update(User user) {
        // 3，通过工厂创建 SqlSession对象，
        SqlSession sqlSession = MybatisConfig.openSession();
        sqlSession.update("com.dawn.dao.UserDao.update", user);
        MybatisConfig.closeSqlSession(sqlSession);
    }

    public void del(Integer id) {
        // 3，通过工厂创建 SqlSession对象，
        SqlSession sqlSession = MybatisConfig.openSession();
        sqlSession.delete("com.dawn.dao.UserDao.del", id);
        MybatisConfig.closeSqlSession(sqlSession);
    }

    public User selectById(Integer id) {
        // 3，通过工厂创建 SqlSession对象，
        SqlSession sqlSession = MybatisConfig.openSession();
        User user = sqlSession.selectOne("com.dawn.dao.UserDao.selectById", id);
        MybatisConfig.closeSqlSession(sqlSession);
        return user;
    }

    public List<User> selectAll() {
        // 3，通过工厂创建 SqlSession对象，
        SqlSession sqlSession = MybatisConfig.openSession();
        List<User> list = sqlSession.selectList("com.dawn.dao.UserDao.selectAll");
        MybatisConfig.closeSqlSession(sqlSession);
        return list;
    }
}
