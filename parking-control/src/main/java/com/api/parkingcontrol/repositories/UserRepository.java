package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingcontrol.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
  
}
