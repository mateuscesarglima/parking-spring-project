package com.api.parkingcontrol.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.api.parkingcontrol.models.AddressModel;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.repositories.AddressRepository;
import com.api.parkingcontrol.repositories.CarRepository;
import com.api.parkingcontrol.repositories.UserRepository;

@Configuration
public class TestConfig implements CommandLineRunner {


  @Autowired
  private UserRepository userRepository;

  @Autowired
  private AddressRepository addressRepository;

  @Autowired
  private CarRepository carRepository;

  @Override
  public void run(String... args) throws Exception {

    UserModel userModel = new UserModel("Mateus Cesar", "85 997724068");
    userRepository.save(userModel);

    CarModel carModel = new CarModel(userModel, "ABC123", "Volkswagem", "GOL", "RED");
    carRepository.save(carModel);

    AddressModel addressModel = new AddressModel("Rua carlos chagas", "779", "Fortaleza", "60541-704", "Brazil", userModel);
    addressRepository.save(addressModel);
  }

}
