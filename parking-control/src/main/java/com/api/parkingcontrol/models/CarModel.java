package com.api.parkingcontrol.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CAR_MODEL")
public class CarModel {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, length = 130)
  private String responsibleName;

  @Column(nullable = false, unique = true, length = 7)
  private String licensePlateCar;

  @Column(nullable = false, length = 70)
  private String brandCar;

  @Column(nullable = false, length = 70)
  private String modelCar;

  @Column(nullable = false, length = 70)
  private String colorCar;

  public CarModel() {
  }

  public CarModel(String responsibleName, String licensePlateCar, String brandCar, String modelCar,
      String colorCar) {
    this.responsibleName = responsibleName;
    this.licensePlateCar = licensePlateCar;
    this.brandCar = brandCar;
    this.modelCar = modelCar;
    this.colorCar = colorCar;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getLicensePlateCar() {
    return licensePlateCar;
  }

  public void setLicensePlateCar(String licensePlateCar) {
    this.licensePlateCar = licensePlateCar;
  }

  public String getResponsibleName() {
    return responsibleName;
  }

  public void setResponsibleName(String responsibleName) {
    this.responsibleName = responsibleName;
  }

  public String getBrandCar() {
    return brandCar;
  }

  public void setBrandCar(String brandCar) {
    this.brandCar = brandCar;
  }

  public String getModelCar() {
    return modelCar;
  }

  public void setModelCar(String modelCar) {
    this.modelCar = modelCar;
  }

  public String getColorCar() {
    return colorCar;
  }

  public void setColorCar(String colorCar) {
    this.colorCar = colorCar;
  }

}
