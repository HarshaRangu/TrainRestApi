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
@Table(name = "Passenger_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passenger_ID")
	private Integer pid;

	@Column(name = "passenger_NAME")
	private String name;

	@Column(name = "passenger_email")
	private String email;

	@Column(name = "passenger_source")
	private String source;

	@Column(name = "passenger_Destination")
	private String destination;

	@Column(name = "journeyDate")
	private Date journeyDate;

	@Column(name = "Ticket_fare")
	private Double fare;

	@Column(name = "Trian_Num")
	private Long trainNum;
}
