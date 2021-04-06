package com.jie.dao;

import com.jie.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * ClassName:UserDao
 * Package:com.jie.dao
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/6 15:06
 * @author:VX438364246
 */
public interface UserMapper {
    //查询全部
    List<User> getUserList();

    //查询一个
    User queryUser(int id);
    User queryUser2(Map<String,Object> map);
    //新增
    int addUser(User user);
    int addUser2(Map<String,Object> map);

    //修改
    int updateUser(User user);
    //查询
     int deleteUser(int id);

}
