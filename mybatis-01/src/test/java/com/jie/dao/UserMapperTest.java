package com.jie.dao;

import com.jie.pojo.User;
import com.jie.utils.MybatisUtils;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * ClassName:UserDaoTest
 * Package:com.jie.dao
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/6 15:27
 * @author:VX438364246
 */
public class UserMapperTest {
    @Test
    public void test() {
        //获取sqlsession对象
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        //执行

        UserMapper mapper = null;
        try {
            mapper = sqlsession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭sqlsession
            sqlsession.close();
        }


    }
    @Test
    public void queryUser(){
        SqlSession sqlSession=MybatisUtils.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       User user= mapper.queryUser(1);
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void  queryUser2(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("uid",1);
      User u= mapper.queryUser2(map);
        System.out.println(u);
        sqlsession.close();
    }
    @Test
public void getUserLike(){
    SqlSession sqlsession = MybatisUtils.getSqlsession();
    UserMapper mapper = sqlsession.getMapper(UserMapper.class);
    List<User> userLike = mapper.getUserLike("%xx3%");
    for (User user : userLike) {
        System.out.println(user);
    }
    sqlsession.close();
}

    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlsession();

        UserMapper userMapper = null;

        userMapper = sqlSession.getMapper(UserMapper.class);
        User u = new User();
        u.setId(5);
        u.setName("xx1");
        u.setPwd("xx2");
        int count = userMapper.addUser(u);
        if (count > 0) {
            System.out.println("新增成功！");
            //提交事务
            sqlSession.commit();
        }
        //userMapper.addUser(new User(5,"xx2","xx3"));


        sqlSession.close();

    }
    @Test
    public void addUser2(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","222");
        map.put("userpwd","222");

        mapper.addUser2(map);

        sqlsession.close();
    }

    public void updateUser(){
        SqlSession sqlSession=MybatisUtils.getSqlsession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        int count=mapper.updateUser(new User(5,"ss1","ss1"));
        if (count>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    public void  deleteUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
      int count=  mapper.deleteUser(5);
      if (count>0){
          System.out.println("删除成功");
      }
        sqlsession.commit();
        sqlsession.close();
    }
}
