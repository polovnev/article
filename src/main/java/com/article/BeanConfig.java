package com.article;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.xml.crypto.Data;

/**
 * Created by polovnev on 03.01.18.
 */
@Configuration
public class BeanConfig {
    
/*
    
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    
    @Bean
    public SessionFactory getSessionFactory() {
        if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
*/
}
