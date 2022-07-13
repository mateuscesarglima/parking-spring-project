package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingcontrol.models.AddressModel;

public interface AddressRepository extends JpaRepository<AddressModel, UUID>{
  
}
