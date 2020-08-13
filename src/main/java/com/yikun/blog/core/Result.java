package com.yikun.blog.core;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

/**
 * 统一API响应结果封装
 */
@Data
@Builder
public class Result<T> {
    private boolean success;
    private String message;
    private T data;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
