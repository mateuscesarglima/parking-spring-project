package com.api.parkingcontrol.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.api.parkingcontrol.models.AddressModel;
import com.api.parkingcontrol.models.CarModel;

public class UserDto {

  @NotBlank
  private String name;

  @NotBlank
  @Size(max = 15)
  private String phoneNumber;

  private CarModel carModel;

  private AddressModel addressModel;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CarModel getCarModel() {
    return carModel;
  }

  public void setCarModel(CarModel carModel) {
    this.carModel = carModel;
  }

  public AddressModel getAddressModel() {
    return addressModel;
  }

  public void setAddressModel(AddressModel addressModel) {
    this.addressModel = addressModel;
  }

}
