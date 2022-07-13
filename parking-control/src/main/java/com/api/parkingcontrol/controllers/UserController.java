package com.api.parkingcontrol.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
  
  @Autowired
  private UserServices userServices;

  @GetMapping
  public ResponseEntity<List<UserModel>> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(userServices.findAll());
  }
}
