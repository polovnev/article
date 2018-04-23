package com.article.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by polovnev on 03.01.18.
 */
@Entity
@Table
public class User {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "user_name")
    private String userName;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "password")
    private String password;
    
    @OneToMany(mappedBy = "user")
    private Set<Article> articles;
    
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
    
    public Set<Article> getArticles() {
        return articles;
    }
    
    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
