package com.jie.dao;

import com.jie.pojo.User;
import org.apache.ibatis.annotations.*;

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
    @Select("select id,name,pwd as password from user")
    List<User> getUser();
    //方法有多个参数，所有参数要加@param
    @Select("select*from user where id=#{id}")
    User getUserID(@Param("id")int id);
    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);
    @Update("UPDATE user SET NAME=#{name}, pwd=#{password} WHERE id=#{id}")
    int updateUser(User user);
    @Delete("delete from user where id=#{id}")
    int deleteUser(User user);



}
