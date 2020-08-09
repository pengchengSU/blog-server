package com.yikun.blog.service;

import com.yikun.blog.entity.Article;
import com.yikun.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    public List<Article> selectAll(){
        return articleMapper.selectAll();
    }
}
