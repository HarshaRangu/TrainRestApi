package com.trainApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trainApi.entity.Passenger;
import com.trainApi.entity.Ticket;
import com.trainApi.service.TrainService;

@RestController
public class TicketRestController {

	@Autowired
	private TrainService service;

	@PostMapping(value = "/bookTicket", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		Ticket bookTikcet = service.bookTikcet(passenger);
		return new ResponseEntity<Ticket>(bookTikcet, HttpStatus.CREATED);
	}

	@GetMapping(value = "/ticket/{ticketNum}", produces = { "application/json" })
	public ResponseEntity<Ticket> getAllTicket(@PathVariable("ticketNum") String ticketNum) {
		Ticket ticket = service.getTicket(ticketNum);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}

	@GetMapping(value = "/allTicktes", produces = { "application/json" })
	public ResponseEntity<List<Ticket>> getAllticket() {
		List<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<List<Ticket>>(allTickets, HttpStatus.OK);
	}

	@PutMapping(value = "/updateTicket", consumes = { "application/json" })
	public ResponseEntity<String> updateTicket(@RequestBody Ticket ticket) {
		String updateTicket = service.updateTicket(ticket);
		return new ResponseEntity<String>(updateTicket, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteTicket/{ticketid}", produces = { "application/json" })
	public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketid) {
		String deleteTicket = service.deleteTicket(ticketid);
		System.out.println("Ticket Deleted Succesfully...");
		return new ResponseEntity<String>(deleteTicket, HttpStatus.OK);
	}
}
