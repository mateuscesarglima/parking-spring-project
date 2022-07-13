package com.api.parkingcontrol.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.dto.CarDto;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.services.CarServices;

@RestController
@CrossOrigin(originPatterns = "*", maxAge = 3600)
@RequestMapping(value = "/car")
public class CarController {

  @Autowired
  private CarServices carServices;

  @PostMapping
  public ResponseEntity<Object> saveCar(@RequestBody @Valid CarDto carDto) {
    if (carServices.existsByLicensePlateCar(carDto.getLicensePlateCar())) {
      return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: License Plate Car is already in use!");
    }

    var carModel = new CarModel();
    BeanUtils.copyProperties(carDto, carModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(carServices.save(carModel));
  }

  @GetMapping
  public ResponseEntity<List<CarModel>> getAllCars() {
    return ResponseEntity.status(HttpStatus.OK).body(carServices.findAll());
  }

}
