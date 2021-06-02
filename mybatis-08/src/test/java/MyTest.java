import com.jie.dao.UserMapper;
import com.jie.pojo.User;
import com.jie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * ClassName:MyTest
 * Package:PACKAGE_NAME
 * Description:strive
 *
 * @date:2021/5/31 17:07
 * @author:VX438364246
 */

public class MyTest {
    @Test
    public void test1(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        User user1 = mapper.queryUserById(1);
        System.out.println(user1);
        System.out.println(user==user1);


        sqlsession.close();

    }
    @Test
    public void test2(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        SqlSession sqlsession2 = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
//        mapper.updateUser(new User(2,"zxc","111"));
        sqlsession.close();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        UserMapper mapper2 = sqlsession2.getMapper(UserMapper.class);
        User user1 = mapper2.queryUserById(1);
        System.out.println(user1);
        System.out.println(user==user1);


        sqlsession.close();

    }
    @Test
    public void updateUser() {
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User u=new User();
        u.setId(1);
        u.setName("xx1");
        u.setPwd("321");
        int i = mapper.updateUser(u);
        if (i>0){
            System.out.println("修改成功");
        }
        sqlsession.close();
    }

}
