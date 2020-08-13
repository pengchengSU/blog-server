package com.yikun.blog.mapper;

import com.yikun.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ArticleMapper {
     List<Article> selectAll();

     Article selectOne(Integer id);
}
