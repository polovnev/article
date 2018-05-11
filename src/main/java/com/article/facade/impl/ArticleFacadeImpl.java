package com.article.facade.impl;

import com.article.facade.ArticleFacade;
import com.article.facade.converter.ArticleConverter;
import com.article.facade.dto.ArticleDto;
import com.article.model.Article;
import com.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by polovnev on 11.05.18.
 */
@Component
public class ArticleFacadeImpl implements ArticleFacade {
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private ArticleConverter articleConverter;
    
    @Override
    public ArticleDto getArticle(long id) {
        Article article = articleService.getArticle(id);
        return articleConverter.convertToArticleDto(article);
    }
}
