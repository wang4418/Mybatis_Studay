package com.jie.dao;

import com.jie.pojo.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

/**
 * ClassName:UserMapper
 * Package:com.jie.dao
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/4/6 11:36
 * @author:VX438364246
 */
public interface UserMapper {


    //查询一个
    User queryUser(int id);
//分页
    List<User> getlimit(Map<String,Object>map);


}
