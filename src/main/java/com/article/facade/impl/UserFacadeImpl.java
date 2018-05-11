package com.article.facade.impl;

import com.article.facade.UserFacade;
import com.article.facade.converter.UserConverter;
import com.article.facade.dto.UserDto;
import com.article.model.User;
import com.article.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by polovnev on 11.05.18.
 */
@Component
public class UserFacadeImpl implements UserFacade {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserConverter userConverter;
    
    @Override
    public UserDto getUser(long id) {
        User user = userService.getUser(id);
        return userConverter.convertToUserDto(user);
    }
}
