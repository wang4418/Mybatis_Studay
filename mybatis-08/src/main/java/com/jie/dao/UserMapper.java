package com.jie.dao;

import com.jie.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:UserMapper
 * Package:com.jie.dao
 * Description:strive
 *
 * @date:2021/5/31 16:57
 * @author:VX438364246
 */
public interface UserMapper {
    //根据id查询用户
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
