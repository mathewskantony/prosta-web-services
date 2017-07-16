package com.prosta.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SECTION")
public class Section {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "duty_roster_frequency")
	private String dutyRosterFrequency;
	
	@Column(name = "duty_roster_trigger")
	private Integer dutyRosterTrigger;
	
	@Column(name = "duty_roster_starts_on")
	private Integer dutyRosterStartsOn;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
	
	
}
