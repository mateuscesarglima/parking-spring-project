package com.api.parkingcontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.AddressModel;
import com.api.parkingcontrol.repositories.AddressRepository;

@Service
public class AddressServices {

  @Autowired
  private AddressRepository addressRepository;

  public List<AddressModel> findAll(){
    return addressRepository.findAll();
  }

}
