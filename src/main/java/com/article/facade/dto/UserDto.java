package com.article.facade.dto;



import java.util.Set;

/**
 * Created by polovnev on 11.05.18.
 */
public class UserDto {
    
    private long id;
    private String userName;
    private String login;
    private String password;
    private Set<ArticleDto> articles;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<ArticleDto> getArticles() {
        return articles;
    }
    
    public void setArticles(Set<ArticleDto> articles) {
        this.articles = articles;
    }
    
}
