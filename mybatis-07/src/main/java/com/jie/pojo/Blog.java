package com.jie.pojo;

import lombok.Data;

import java.util.Date;

/**
 * ClassName:Blog
 * Package:com.jie.pojo
 * Description:strive
 *
 * @date:2021/4/12 16:46
 * @author:VX438364246
 */
 @Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致
    private int views;
}
