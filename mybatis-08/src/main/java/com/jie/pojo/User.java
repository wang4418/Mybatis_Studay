package com.jie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName:User
 * Package:com.jie.pojo
 * Description:strive
 *
 * @date:2021/5/31 16:47
 * @author:VX438364246
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private int id;
    private  String name;
    private  String pwd;
}
