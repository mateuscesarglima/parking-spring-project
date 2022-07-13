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

import com.api.parkingcontrol.dto.AddressDto;
import com.api.parkingcontrol.models.AddressModel;
import com.api.parkingcontrol.services.AddressServices;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
  
  @Autowired
  private AddressServices addressServices;

  @GetMapping
  public ResponseEntity<List<AddressModel>> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(addressServices.findAll());
  }


  @PostMapping
  public ResponseEntity<Object> saveAddress(@RequestBody @Valid AddressDto addressDto){


    var addressModel = new AddressModel();
    BeanUtils.copyProperties(addressDto, addressModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(addressServices.save(addressModel));
  }
}
