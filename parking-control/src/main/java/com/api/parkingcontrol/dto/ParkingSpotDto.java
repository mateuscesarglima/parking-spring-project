package com.api.parkingcontrol.dto;

import javax.validation.constraints.NotBlank;

import com.api.parkingcontrol.models.CarModel;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

    private CarModel carModel;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}