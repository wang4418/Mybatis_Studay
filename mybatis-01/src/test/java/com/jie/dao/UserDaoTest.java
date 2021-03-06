package com.jie.dao;

import com.jie.pojo.User;
import com.jie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName:UserDaoTest
 * Package:com.jie.dao
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/6 15:27
 * @author:VX438364246
 */
public class UserDaoTest {
    @Test
    public void test(){
        //获取sqlsession对象
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        //执行
        UserDao mapper = sqlsession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
//            System.out.println(user.getId());
//            System.out.println(user.getName());
//            System.out.println(user.getPwd());
        }
        //关闭sqlsession
        sqlsession.close();
    }
}
