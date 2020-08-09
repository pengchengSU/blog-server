package com.yikun.blog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * CREATE TABLE `article` (
 *   `id` int(11) NOT NULL AUTO_INCREMENT,
 * 	`category` varchar(50) NOT NULL,
 *   `title` varchar(50) NOT NULL,
 *   `content` text NOT NULL,
 * 	`visits` int(11) NOT NULL DEFAULT 0,
 * 	`thumbs` int(11) NOT NULL DEFAULT 0,
 *   `gmt_create` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
 *   `gmt_modify` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 *   PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB;
 */

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
