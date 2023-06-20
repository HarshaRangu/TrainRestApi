package com.trainApi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainApi.entity.Passenger;
import com.trainApi.entity.Ticket;

public interface PassengerRepository extends JpaRepository<Passenger, Serializable> {

	
}
