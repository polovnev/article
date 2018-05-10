package com.article.dao.impl;

import com.article.dao.ArticleDao;
import com.article.model.Article;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


/**
 * Created by polovnev on 03.01.18.
 */
@Repository
@Transactional
public class ArticleDaoImp  extends AbstractDaoImpl implements ArticleDao  {
    
    
    protected ArticleDaoImp() {
        super(Article.class);
    }
}
