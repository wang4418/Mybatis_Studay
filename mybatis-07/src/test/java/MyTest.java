import com.jie.dao.BlogMapper;
import com.jie.pojo.Blog;
import com.jie.utils.IDUtils;
import com.jie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName:MyTest
 * Package:PACKAGE_NAME
 * Description:strive
 *
 * @date:2021/4/12 17:49
 * @author:VX438364246
 */
public class MyTest {
    @Test
    public void addBlog(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("jie");
        blog.setCreateTime(new Date());
        blog.setViews(5);
        int i = mapper.addBlog(blog);
        if (i>0){
            System.out.println("增加成功");
        }

        sqlsession.close();

    }
    @Test
    public void queryBlogIf(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","x3");
        map.put("author","c");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlsession.close();
    }

    @Test
    public void queryBlogChose(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
        map.put("title","x3");
        //map.put("author","c");
        map.put("views","5");
        List<Blog> blogs = mapper.queryBlogChose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlsession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlsession = MybatisUtils.getSqlsession();
        BlogMapper mapper = sqlsession.getMapper(BlogMapper.class);
        HashMap map=new HashMap();
       // map.put("title","测试");
        map.put("author","测试");
        map.put("views","55");
        map.put("id","1");
        int i = mapper.updateBlog(map);
if(i>0) {
    System.out.println("成功！");
}

        sqlsession.close();
    }

}
