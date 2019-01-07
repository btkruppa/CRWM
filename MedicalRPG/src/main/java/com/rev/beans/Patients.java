package com.rev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Summary *
 * Patient object takes in patient table information from the sql
 * @author Darius
 */
@Entity
@Table(name="PATIENTS")
public class Patients {

	public Patients(int patient_ID, String first_Name, String last_Name, int age, int disease_ID) {
		super();
		this.patient_ID = patient_ID;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.age = age;
		this.disease_ID = disease_ID;
	}
	public Patients() {
	
	}
	@Id
	/*@GeneratedValue(strategy=GenerationType.AUTO, generator="patientSequence")
	@SequenceGenerator(allocationSize= 1,name="patientSequence",sequenceName="SQ_PATIENT_PK")*/
	@Column(name="PATIENT_ID")
	private int patient_ID;
	@Column(name="FIRST_NAME")
	private String first_Name;
	@Column(name="LAST_NAME")
	private String last_Name;
	@Column(name="AGE")
	private int age;
	@Column(name="DISEASE_ID")
	private int disease_ID;
	public synchronized int getPatient_ID() {
		return patient_ID;
	}
	public synchronized void setPatient_ID(int patient_ID) {
		this.patient_ID = patient_ID;
	}
	public synchronized String getFirst_Name() {
		return first_Name;
	}
	public synchronized void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public synchronized String getLast_Name() {
		return last_Name;
	}
	public synchronized void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public synchronized int getAge() {
		return age;
	}
	public synchronized void setAge(int age) {
		this.age = age;
	}
	public synchronized int getDisease_ID() {
		return disease_ID;
	}
	public synchronized void setDisease_ID(int disease_ID) {
		this.disease_ID = disease_ID;
	}
	@Override
	public String toString() {
		return "Patients [Patient_ID=" + patient_ID + ", First_Name=" + first_Name + ", Last_Name=" + last_Name
				+ ", Age=" + age + ", Disease_ID=" + disease_ID + "]";
	}
}
