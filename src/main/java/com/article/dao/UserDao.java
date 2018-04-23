package com.article.dao;

import com.article.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by polovnev on 03.01.18.
 */
public interface UserDao{
    
    User getUser(long id);
}
