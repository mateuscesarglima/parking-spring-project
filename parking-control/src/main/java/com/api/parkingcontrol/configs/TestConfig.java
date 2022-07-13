package com.api.parkingcontrol.configs;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.CarRepository;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

  @Autowired
  private ParkingSpotRepository parkingSpotRepository;

  @Autowired
  private CarRepository carRepository;

  @Override
  public void run(String... args) throws Exception {

    CarModel carModel = new CarModel("Mateus Cesar", "LALA123", "Volks", "gol", "WHITE");
    ParkingSpotModel parkingSpotModel = new ParkingSpotModel("600A", LocalDateTime.now(), "600", "A", carModel);
    carRepository.save(carModel);
    parkingSpotRepository.save(parkingSpotModel);

  }

}
