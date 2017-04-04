package com.demo.models;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.demo.domain.*;

@Transactional
public class UserDao {

  @Autowired
  private SessionFactory sessionFactory;

  public User save(User user) {
    Session session = sessionFactory.getCurrentSession();
    session.save(user);

    return user;
  }

}
