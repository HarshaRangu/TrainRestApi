package com.trainApi.serviceImp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainApi.entity.Passenger;
import com.trainApi.entity.Ticket;
import com.trainApi.repository.PassengerRepository;
import com.trainApi.repository.TicketRepository;
import com.trainApi.service.TrainService;

@Service
public class TrainServiceImp implements TrainService {

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private PassengerRepository passengerRepositrory;

	private Map<String, Ticket> ticketMap = new HashMap<>();

	@Override
	public Ticket bookTikcet(Passenger passenger) {
		String ticketNum = UUID.randomUUID().toString().replace("-", "");

		Ticket ticinfo = new Ticket();
		ticinfo.setTicketNum(ticketNum);
		ticinfo.setName(passenger.getName());
		ticinfo.setSource(passenger.getSource());
		ticinfo.setDestination(passenger.getDestination());
		ticinfo.setJounreydate(passenger.getJourneyDate());
		ticinfo.setTicketPrice(2230.00);
		ticinfo.setTicketStatus("confirmed");
		ticinfo.setTrainNum(passenger.getTrainNum());

		ticketMap.put(ticketNum, ticinfo);
		Ticket save = ticketRepository.save(ticinfo);

		passenger = passengerRepositrory.save(passenger);

		System.out.println(ticinfo);
		return ticinfo;
	}

	@Override
	public Ticket getTicket(String ticketNum) {
		if (ticketMap.containsKey(ticketNum)) {
			return ticketMap.get(ticketNum);
		}
		return null;
	}

	@Override
	public String updateTicket(Ticket ticket) {
		Integer ticketId = ticket.getTicketid();
		System.out.println(ticket);
		Ticket saveTicket = ticketRepository.save(ticket);

		return "Ticket Updated Succesfully";
	}

	@Override
	public String deleteTicket(Integer ticketid) {

		ticketRepository.deleteById(ticketid);

		return "Ticket Deleted Succesfully";
	}

	@Override
	public List<Ticket> getAllTickets() {

		return ticketRepository.findAll();
	}

}
