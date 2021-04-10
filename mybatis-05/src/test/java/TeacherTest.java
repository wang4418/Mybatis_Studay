import com.jie.dao.StudentMapper;
import com.jie.dao.TeacherMapper;
import com.jie.pojo.Student;
import com.jie.pojo.Teacher;
import com.jie.utils.MybatisUtils;
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
        List<Teacher> getteacher = mapper.getteacher();
        for (Teacher teacher : getteacher) {
            System.out.println(teacher);
        }
        sqlsession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlsession.close();
    }
    @Test
    public void getStudent2(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlsession.close();
    }
}
