package com.api.parkingcontrol.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.repositories.UserRepository;

@Service
public class UserServices {

  @Autowired
  private UserRepository userRepository;

  public List<UserModel> findAll(){
    return userRepository.findAll();
  }

  @Transactional
  public Object save(UserModel userModel) {
    return userRepository.save(userModel);
  }

  public boolean existsByName(String name){
    return userRepository.existsByName(name);
  }
}
