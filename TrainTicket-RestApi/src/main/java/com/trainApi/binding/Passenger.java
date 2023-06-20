package com.trainApi.binding;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class Passenger {

	private Integer pid;

	private String name;

	private String email;

	private String source;

	private String destination;

	private Date journeyDate;

	private Double fare;

	private Long trainNum;
}
