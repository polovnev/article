package com.article.dao.impl;


import com.article.dao.Dao;
import com.article.util.HibernateInitializer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public abstract class AbstractDaoImpl<T> implements Dao<T> {

    private Class<T> persistentClass;
    
    @Autowired
    private EntityManager entityManager;
        
    public AbstractDaoImpl(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }
    
    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    public Class<T> getPersistentClass() {
        return persistentClass;
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public T findById(Long id, String... properties) {
        T entity = (T) getSession().get(getPersistentClass(), id);
        HibernateInitializer.initializeEntities(entity, properties);
        return entity;
    }

    @Override
    @Transactional
    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }

    @Override
    @Transactional
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Session session = getSession();
        Object obj = session.get(getPersistentClass(), id);
        if (obj != null) {
            session.delete(obj);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public T merge(T entity) {
        return (T) getSession().merge(entity);
    }

    @Override
    public Long add(T entity) {
        return (Long) getSession().save(entity);
    }

}
