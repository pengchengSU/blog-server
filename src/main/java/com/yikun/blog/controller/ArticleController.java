package com.yikun.blog.controller;

import com.yikun.blog.core.BusinessException;
import com.yikun.blog.core.Result;
import com.yikun.blog.entity.Article;
import com.yikun.blog.service.ArticleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/list")
    public Result list(){
        List<Article> result = articleService.selectAll();
        return Result.builder().success(true).data(result).build();
    }

    @GetMapping("/getOne")
    public Result getOne(@RequestParam Integer id){
        Article result = articleService.selectOne(id);
        return Result.builder().success(true).data(result).build();
    }

}
