package com.api.parkingcontrol.models;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_user")
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false, unique = true, length = 12)
  private String phoneNumber;
  
  @JsonIgnore
  @OneToOne(mappedBy = "userModel", cascade = CascadeType.ALL)
  private CarModel carModel;

  @JsonIgnore
  @OneToOne(mappedBy = "userModel", cascade = CascadeType.ALL)
  private AddressModel addressModel;

  public UserModel() {
  }

  public UserModel(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

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
