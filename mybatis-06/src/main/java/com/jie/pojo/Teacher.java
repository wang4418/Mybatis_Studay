package com.jie.pojo;

import lombok.Data;

import java.util.List;

/**
 * ClassName:Thacher
 * Package:com.jie.pojo
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/4/10 12:06
 * @author:VX438364246
 */
@Data
public class Teacher {
    private int id;
    private  String name;

    //一个老师有多个学生
    private List<Student> students;
}
