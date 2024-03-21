package com.heima.article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.article.pojos.ApArticle;
import com.heima.model.article.dtos.ArticleHomeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author liweihua
 * @classname ApArticleMapper
 * @description TODO
 * @date 2024/1/8 9:49
 */
@Mapper
public interface  ApArticleMapper extends BaseMapper<ApArticle> {

    /**
     * 加载文章列表
     * @param type 1 加载更多  2 加载最新
     * @return
     */
    public List<ApArticle> loadArticleList(ArticleHomeDto dto,Short type);

}
