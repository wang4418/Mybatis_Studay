package com.jie.pojo;

import org.apache.ibatis.type.Alias;

/**
 * ClassName:User
 * Package:com.jie.pojo
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/3/6 14:59
 * @author:VX438364246
 */
@Alias("hello")
public class User {
    private int id;
    private String name;
    private  String pwd;

    public User() {

    }
    public User(int id,String name,String pwd) {
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
