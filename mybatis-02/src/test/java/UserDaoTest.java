import com.jie.dao.UserMapper;
import com.jie.pojo.User;
import com.jie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
    @Test
    public void getUserList(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user:userList) {
            System.out.println(user);
        }

        sqlsession.close();
    }
}
