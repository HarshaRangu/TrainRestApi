package com.trainApi.binding;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Ticket {
	private Integer ticketid;



	private String name;

	private String source;

	private String destination;

	private Date jounreydate;

	private Long trainNum;

	private String ticketNum;

	private String ticketStatus;

	private Double ticketPrice;

}
