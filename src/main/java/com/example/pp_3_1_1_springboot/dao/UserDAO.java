package com.example.pp_3_1_1_springboot.dao;

import com.example.pp_3_1_1_springboot.model.User;
import java.util.List;

public interface UserDAO {

  void saveUser(User user);
  void deleteUser(Long id);
  User show(Long id);
  public List<User> getUsers();
}
