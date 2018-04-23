package com.article.dao.impl;


import com.article.dao.UserDao;
import com.article.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * Created by polovnev on 03.01.18.
 */
@Repository
@Transactional
public class UserDaoImpl implements UserDao{
    
    @Autowired
    private EntityManager entityManager;
    
 
    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    @Override
    public User getUser(long id) {
        return (User) getSession().get(User.class,id);
    }
}
