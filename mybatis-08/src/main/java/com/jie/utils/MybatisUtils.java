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
 * Description:strive
 *
 * @date:2021/5/31 16:49
 * @author:VX438364246
 */
public class MybatisUtils {
    private  static SqlSessionFactory sqlSessionFactory;
    static {
        String resource="mybatis-config.xml";
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlsession(){
        return sqlSessionFactory.openSession(true);
    }


}
