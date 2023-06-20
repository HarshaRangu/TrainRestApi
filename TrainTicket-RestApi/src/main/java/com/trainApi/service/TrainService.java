package com.trainApi.service;

import java.util.List;

import com.trainApi.entity.Passenger;
import com.trainApi.entity.Ticket;

public interface TrainService {

	public Ticket bookTikcet(Passenger passenger);

	public Ticket getTicket(String ticketNum);

	public String updateTicket(Ticket ticket);

	public String deleteTicket(Integer ticketid);

	public List<Ticket> getAllTickets();
}
