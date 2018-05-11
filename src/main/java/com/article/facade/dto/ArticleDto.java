package com.article.facade.dto;

/**
 * Created by polovnev on 11.05.18.
 */
public class ArticleDto {
    
    private long id;
    private String title;
    private String body;
    private UserDto userDto;
    
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
    
    public UserDto getUserDto() {
        return userDto;
    }
    
    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
    
}
