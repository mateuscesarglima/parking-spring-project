package com.api.parkingcontrol.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.dto.UserDto;
import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserServices userServices;

  @GetMapping
  public ResponseEntity<List<UserModel>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(userServices.findAll());
  }

  @PostMapping
  public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDto userdDto) {

    if (userServices.existsByName(userdDto.getName())) {
      return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exist");
    }
    var userModel = new UserModel();
    BeanUtils.copyProperties(userdDto, userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(userServices.save(userModel));
  }
}
