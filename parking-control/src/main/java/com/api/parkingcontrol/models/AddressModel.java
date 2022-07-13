package com.api.parkingcontrol.models;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_address")
public class AddressModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  private String streetName;

  private String houseNumber;

  private String city;

  private String zipCode;

  private String country;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "userModel_id", referencedColumnName = "id")
  private UserModel userModel;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

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
