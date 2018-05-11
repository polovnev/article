package com.article.service.impl;

import com.article.dao.UserDao;
import com.article.model.User;
import com.article.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by polovnev on 03.01.18.
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;
    
    @Override
    public User getUser(long id) {
        return (User) userDao.findById(id, "articles");
    }
}
