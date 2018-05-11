package com.article.facade;

import com.article.facade.dto.ArticleDto;
import com.article.model.Article;

/**
 * Created by polovnev on 11.05.18.
 */
public interface ArticleFacade {
    
    ArticleDto getArticle(long id);

}
