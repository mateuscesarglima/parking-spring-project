package com.api.parkingcontrol.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.repositories.CarRepository;

@Service
public class CarServices {

  @Autowired
  private CarRepository carRepository;

  public Object save(CarModel carModel){
    return carRepository.save(carModel);
  } 

  public List<CarModel> findAll() {
    return carRepository.findAll();
  }

  public boolean existsByLicensePlateCar(String licensePlateCar) {
    return carRepository.existsByLicensePlateCar(licensePlateCar);
  }
}
