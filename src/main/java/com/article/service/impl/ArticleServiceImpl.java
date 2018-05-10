package com.article.service.impl;

import com.article.dao.ArticleDao;
import com.article.model.Article;
import com.article.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by polovnev on 03.01.18.
 */
@Component
public class ArticleServiceImpl implements ArticleService {
    
    @Autowired
    private ArticleDao articleDao;
    
    @Override
    public Article getArticle(long id) {
        return (Article) articleDao.findById(id,null);
    }
}
