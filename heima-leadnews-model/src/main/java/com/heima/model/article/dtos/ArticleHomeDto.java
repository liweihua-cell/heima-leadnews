package com.heima.model.article.dtos;

import lombok.Data;

import java.util.Date;

/**
 * @author liweihua
 * @classname ArticleHomeDto
 * @description TODO
 * @date 2024/1/8 9:45
 */
@Data
public class ArticleHomeDto {

    //最大时间
    Date maxBehotTime;

    //最小时间
    Date minBehotTime;

    //分页size
    Integer size;

    //频道id
    String tag;
}
