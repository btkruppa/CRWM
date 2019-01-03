package com.rev.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYMPTOMS")
public class Symptom {

	public Symptom() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="SYMPTOM_ID")
	private int Symptom_ID;
	@Column(name="SYMPTOM_NAME")
	private String Symptom_Name;
	@Column(name="SYMPTOM_DESCRIPTION")
	private String Symptom_Description;
	@Column(name="IS_OBSERVABLE")
	private String is_Observable;
	@Column(name="IS_TESTABLE")
	private String is_Testable;
	@Column(name="SYMPTOM_TEST")
	private String Symptom_Test;
}
