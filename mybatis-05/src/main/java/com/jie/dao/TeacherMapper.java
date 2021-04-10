package com.jie.dao;

import com.jie.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * ClassName:TeacherMapper
 * Package:com.jie.dao
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/4/10 12:10
 * @author:VX438364246
 */
public interface TeacherMapper {
    @Select("SELECT*FROM teacher")
    List<Teacher> getteacher();

}
