package com.api.parkingcontrol.services;

import java.util.List;

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
  
}
