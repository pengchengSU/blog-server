package com.yikun.blog.mapper;

import com.yikun.blog.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ArticleMapperTest {

    @Autowired
    ArticleMapper articleMapper;

    @Test
    public void selectAll(){
        List<Article> articles = articleMapper.selectAll();
        System.out.println(articles);
    }

    @Test
    public void selectOne(){
        Article article = articleMapper.selectOne(1);
        System.out.println(article);
    }
}
