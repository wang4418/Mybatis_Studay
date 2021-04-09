import com.jie.dao.UserMapper;
import com.jie.pojo.User;
import com.jie.utils.MybatisUtils;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


/**
 * ClassName:UserDaoTest
 * Package:PACKAGE_NAME
 * Description:每一个牛B的人物都有一段苦B的岁月，只要像傻B一样坚持，终将会牛B！
 *
 * @date:2021/4/6 11:45
 * @author:VX438364246
 */
public class UserDaoTest {
    //底层主要反射
    @Test
    public void getUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        List<User> user = mapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }

        sqlsession.close();
    }
    @Test
    public void getUserid(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User userID = mapper.getUserID(1);
        System.out.println(userID);
        sqlsession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User u=new User();
        u.setId(7);
        u.setName("x7");
        u.setPassword("xxx7");

        mapper.addUser(u);

        sqlsession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("xx4");
        user.setPassword("1111");
        user.setId(7);
        mapper.updateUser(user);
        sqlsession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = new User();

        user.setId(7);
        mapper.deleteUser(user);
        sqlsession.close();
    }
}
