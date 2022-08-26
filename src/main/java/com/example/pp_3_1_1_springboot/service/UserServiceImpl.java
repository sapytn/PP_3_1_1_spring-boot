package com.example.pp_3_1_1_springboot.service;

import com.example.pp_3_1_1_springboot.dao.UserDAO;
import com.example.pp_3_1_1_springboot.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDAO userDAO;

  @Transactional
  @Override
  public void saveUser(User user) {
    userDAO.saveUser(user);
  }

  @Transactional
  @Override
  public void deleteUser(Long id) {
    userDAO.deleteUser(id);
  }

  @Transactional
  @Override
  public List<User> getUsers() {
    return userDAO.getUsers();
  }

  @Transactional
  @Override
  public User show(Long id) {
    return userDAO.show(id);
  }
}
