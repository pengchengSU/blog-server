package com.yikun.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Article implements Serializable {
    private Integer id;
    private String category;
    private String title;
    private String introduction;
    private String content;
    private Integer visits;
    private Integer thumbs;
    private Date gmtCreate;
    private Date gmtModify;
}
