package com.rev.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Summary * Takes in symptom from sql symptoms table Use a join table to
 * connect the many to many operation to Disease
 * 
 * @author Darius
 */

@Entity
@Table(name = "SYMPTOMS")
public class Symptom {

	@ManyToMany(mappedBy = "symptom")
	private Set<Disease> diseases = new HashSet<>();

	public Symptom(int symptom_ID, String symptom_Name, String symptom_Description, String is_Observable,
			String is_Testable, String symptom_Test) {
		super();
		this.symptom_ID = symptom_ID;
		this.symptom_Name = symptom_Name;
		this.symptom_Description = symptom_Description;
		this.is_Observable = is_Observable;
		this.is_Testable = is_Testable;
		this.symptom_Test = symptom_Test;
	}

	public Symptom() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "SYMPTOM_ID")
	private int symptom_ID;
	@Column(name = "SYMPTOM_NAME")
	private String symptom_Name;
	@Column(name = "SYMPTOM_DESCRIPTION")
	private String symptom_Description;
	@Column(name = "IS_OBSERVABLE")
	private String is_Observable;
	@Column(name = "IS_TESTABLE")
	private String is_Testable;
	@Column(name = "SYMPTOM_TEST")
	private String symptom_Test;

	public synchronized int getSymptom_ID() {
		return symptom_ID;
	}

	public synchronized void setSymptom_ID(int symptom_ID) {
		this.symptom_ID = symptom_ID;
	}

	public synchronized String getSymptom_Name() {
		return symptom_Name;
	}

	public synchronized void setSymptom_Name(String symptom_Name) {
		this.symptom_Name = symptom_Name;
	}

	public synchronized String getSymptom_Description() {
		return symptom_Description;
	}

	public synchronized void setSymptom_Description(String symptom_Description) {
		this.symptom_Description = symptom_Description;
	}

	public synchronized String getIs_Observable() {
		return is_Observable;
	}

	public synchronized void setIs_Observable(String is_Observable) {
		this.is_Observable = is_Observable;
	}

	public synchronized String getIs_Testable() {
		return is_Testable;
	}

	public synchronized void setIs_Testable(String is_Testable) {
		this.is_Testable = is_Testable;
	}

	public synchronized String getSymptom_Test() {
		return symptom_Test;
	}

	public synchronized void setSymptom_Test(String symptom_Test) {
		this.symptom_Test = symptom_Test;
	}

	@Override
	public String toString() {
		return "Symptom [diseases=" + diseases + ", symptom_ID=" + symptom_ID + ", symptom_Name=" + symptom_Name
				+ ", symptom_Description=" + symptom_Description + ", is_Observable=" + is_Observable + ", is_Testable="
				+ is_Testable + ", symptom_Test=" + symptom_Test + "]";
	}

}
