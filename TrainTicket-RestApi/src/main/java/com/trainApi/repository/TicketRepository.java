package com.trainApi.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainApi.entity.Ticket;

@Repository
public interface TicketRepository  extends JpaRepository<Ticket, Serializable>{

}
