package com.jie.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:MybatisUtils
 * Package:com.jie.utils
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/6 14:34
 * @author:VX438364246
 */
//sqlSessionFactory  --sqlSession
public class MybatisUtils {
  private   static SqlSessionFactory sqlSessionFactory;
    static {
        try {
//            1.使用mybatis获取sqlSessionFactory
            String resource="mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
             sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //从sqlSessionFactory获取实例
    //sqlSession包含了面向数据执行sql命令所需方法
    public static SqlSession getSqlsession(){
        return sqlSessionFactory.openSession();
    }

}
