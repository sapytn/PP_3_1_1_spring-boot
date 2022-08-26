package com.example.pp_3_1_1_springboot.dao;

import com.example.pp_3_1_1_springboot.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public void saveUser(User user) {
    User newUser = entityManager.merge(user);
    user.setId(newUser.getId());
  }

  @Override
  public void deleteUser(Long id) {
    User user = entityManager.find(User.class, id);
    entityManager.remove(user);
  }

  @Override
  public User show(Long id) {
    User user = entityManager.find(User.class, id);
    return user;
  }


  @Override
  public List<User> getUsers() {
    TypedQuery<User> query = entityManager.createQuery("select user from User user", User.class);
    return query.getResultList();
  }
}
