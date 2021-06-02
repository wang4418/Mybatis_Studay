package com.jie.dao;

import com.jie.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * ClassName:BlogMapper
 * Package:com.jie.dao
 * Description:strive
 *
 * @date:2021/4/12 17:05
 * @author:VX438364246
 */
public interface BlogMapper {
    //插入数据
    int addBlog(Blog blog);

    //查询
    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChose(Map map);
    //更新博客(修改)
    int updateBlog(Map map);
}
