package com.trainApi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Tikcet_details")
public class Ticket {

	@Id
	@Column(name="Ticket_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketid;
	
	@Column(name = "passenger_name")
	private String name;

	@Column(name = "passenger_source")
	private String source;

	@Column(name = "passenger_Destination")
	private String destination;

	@Column(name = "journeyDate")
	private Date jounreydate;

	@Column(name = "Trian_Num")
	private Long trainNum;

	@Column(name = "Ticket_Num")
	private String ticketNum;

	@Column(name = "Status")
	private String ticketStatus;

	@Column(name = "Ticket_price")
	private Double ticketPrice;

}
