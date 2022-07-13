package com.api.parkingcontrol.dto;

import javax.validation.constraints.NotBlank;

import com.api.parkingcontrol.models.UserModel;

public class AddressDto {
  
  @NotBlank
  private String streetName;

  @NotBlank
  private String houseNumber;

  @NotBlank
  private String city;

  @NotBlank
  private String zipCode;

  @NotBlank
  private String country;

  private UserModel userModel;


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UserModel getUserModel() {
    return userModel;
  }

  public void setUserModel(UserModel userModel) {
    this.userModel = userModel;
  }

  
}
