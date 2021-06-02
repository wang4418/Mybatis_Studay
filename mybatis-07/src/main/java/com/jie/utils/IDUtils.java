package com.jie.utils;

import com.jie.dao.BlogMapper;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;


import java.util.UUID;

/**
 * ClassName:IDutils
 * Package:com.jie.utils
 * Description:strive
 *
 * @date:2021/4/12 17:10
 * @author:VX438364246
 */
public class IDUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void getid(){
        System.out.println(IDUtils.getId());
    }

}
