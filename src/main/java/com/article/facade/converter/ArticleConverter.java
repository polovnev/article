package com.article.facade.converter;

import com.article.facade.dto.ArticleDto;
import com.article.facade.dto.UserDto;
import com.article.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by polovnev on 11.05.18.
 */
@Component
public class ArticleConverter {
    
    @Autowired
    private UserConverter userConverter;
    
    public ArticleDto convertToArticleDto(Article article) {
        if (article == null) {
            return null;
        }
        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(article.getId());
        articleDto.setTitle(article.getTitle());
        articleDto.setBody(article.getBody());
        UserDto userDto = userConverter.convertToUserDto(article.getUser());
        articleDto.setUserDto(userDto);
        return articleDto;
    }
}
