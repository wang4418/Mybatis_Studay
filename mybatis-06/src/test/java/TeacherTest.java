import com.jie.dao.StudentMapper;
import com.jie.dao.TeacherMapper;
import com.jie.pojo.Student;
import com.jie.pojo.Teacher;
import com.jie.utils.MybatisUtils;
import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName:TeacherTest
 * Package:PACKAGE_NAME
 * Description:strive
 *
 * @date:2021/4/10 14:23
 * @author:VX438364246
 */
public class TeacherTest {

    @Test
    public void getTeacher(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);

        sqlsession.close();
    }

    @Test
    public void getTeacher2(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        TeacherMapper mapper = sqlsession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);
        System.out.println(teacher2);

        sqlsession.close();
    }
}
