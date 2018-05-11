package com.article.facade.converter;

import com.article.facade.dto.ArticleDto;
import com.article.facade.dto.UserDto;
import com.article.model.Article;
import com.article.model.User;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by polovnev on 11.05.18.
 */
@Component
public class UserConverter {
    
    @Autowired
    private ArticleConverter articleConverter;
    
    public UserDto convertToUserDto(User user) {
        if (user == null) {
            return null;
        }
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setUserName(user.getUserName());
        Set<ArticleDto> articleDtos = getArticleDtos(user.getArticles());
        userDto.setArticles(articleDtos);
        return userDto;
    }
    
    private Set<ArticleDto> getArticleDtos(Set<Article> articles) {
        if (!Hibernate.isInitialized(articles)) {
            return null;
        }
        Set<ArticleDto> articleDtos = new HashSet<ArticleDto>();
        for (Article article : articles) {
            User user = article.getUser();
            article.setUser(null);
            ArticleDto articleDto = articleConverter.convertToArticleDto(article);
            articleDtos.add(articleDto);
            article.setUser(user);
        }
        return articleDtos;
    }
}
