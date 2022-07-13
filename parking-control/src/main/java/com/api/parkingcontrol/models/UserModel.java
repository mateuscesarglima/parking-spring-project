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

  @OneToOne(mappedBy = "userModel", cascade = CascadeType.ALL)
  private CarModel carModel;

  @OneToOne(mappedBy = "userModel", cascade = CascadeType.ALL)
  private AddressModel addressModel;

  public UserModel() {
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


}
