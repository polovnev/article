package com.article.model;


import javax.persistence.*;

/**
 * Created by polovnev on 03.01.18.
 */
@Entity
@Table
public class Article {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "body")
    private String body;
    
    @ManyToOne
    @JoinColumn(name="user", nullable=false)
    private User user;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getBody() {
        return body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
}
