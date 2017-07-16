package com.prosta.model;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "version")
	private Integer version;
	
	@Column(name = "time_from")
	private Time from;
	
	@Column(name = "time_to")
	private Time to;
	
	@Column(name = "payable_hours")
	private Double payableHours;
	
	@Column(name = "weightage")
	private Double weightage;
	
	@Column(name = "allocation")
	private Integer allocation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Section section;
}
