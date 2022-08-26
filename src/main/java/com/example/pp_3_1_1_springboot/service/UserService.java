package com.example.pp_3_1_1_springboot.service;

import com.example.pp_3_1_1_springboot.model.User;
import java.util.List;

public interface UserService {

  public void saveUser(User user);
  public void deleteUser(Long id);

  public List<User> getUsers();

  public User show(Long id);

}
