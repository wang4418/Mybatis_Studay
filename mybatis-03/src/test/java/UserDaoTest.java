import com.jie.dao.UserMapper;
import com.jie.pojo.User;
import com.jie.utils.MybatisUtils;
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
     static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void getUserList(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.queryUser(1);
        System.out.println(user);

        sqlsession.close();
    }
    @Test
    public void getlog4j(){
        logger.info("信息：");
        logger.debug("信息");
        logger.error("信息");
    }
    @Test
    public void getlimit(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("startIndex",0);
        map.put("pageSize",2);
       List<User>users= mapper.getlimit(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlsession.close();

    }

}
