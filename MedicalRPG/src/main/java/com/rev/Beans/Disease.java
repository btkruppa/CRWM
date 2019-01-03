package com.rev.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="DISEASE")
public class Disease {

	public Disease() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="DISEASE_ID")
	private int DISEASE_ID;
	@Column(name="DISEASE_NAME")
	private String DISEASE_NAME;
	@Column(name="DISEASE_DESCRIPTION")
	private String DISEASE_DESCRIPTION;
}
