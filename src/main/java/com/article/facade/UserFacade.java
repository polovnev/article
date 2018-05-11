package com.article.facade;

import com.article.facade.dto.UserDto;

/**
 * Created by polovnev on 11.05.18.
 */
public interface UserFacade {
    
    UserDto getUser(long id);
    
}
