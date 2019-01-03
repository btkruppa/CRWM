package com.rev.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PATIENT")
public class Patients {

	public Patients(int patient_ID, String first_Name, String last_Name, int age, int disease_ID) {
		super();
		Patient_ID = patient_ID;
		First_Name = first_Name;
		Last_Name = last_Name;
		Age = age;
		Disease_ID = disease_ID;
	}
	public Patients() {
		// TODO Auto-generated constructor stub
	}
	@Id
	/*@GeneratedValue(strategy=GenerationType.AUTO, generator="patientSequence")
	@SequenceGenerator(allocationSize= 1,name="patientSequence",sequenceName="SQ_PATIENT_PK")*/
	@Column(name="PATIENT_ID")
	private int Patient_ID;
	@Column(name="FIRST_NAME")
	private String First_Name;
	@Column(name="LAST_NAME")
	private String Last_Name;
	@Column(name="AGE")
	private int Age;
	@Column(name="DISEASE_ID")
	private int Disease_ID;
	public synchronized int getPatient_ID() {
		return Patient_ID;
	}
	public synchronized void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}
	public synchronized String getFirst_Name() {
		return First_Name;
	}
	public synchronized void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public synchronized String getLast_Name() {
		return Last_Name;
	}
	public synchronized void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public synchronized int getAge() {
		return Age;
	}
	public synchronized void setAge(int age) {
		Age = age;
	}
	public synchronized int getDisease_ID() {
		return Disease_ID;
	}
	public synchronized void setDisease_ID(int disease_ID) {
		Disease_ID = disease_ID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + Disease_ID;
		result = prime * result + ((First_Name == null) ? 0 : First_Name.hashCode());
		result = prime * result + ((Last_Name == null) ? 0 : Last_Name.hashCode());
		result = prime * result + Patient_ID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patients other = (Patients) obj;
		if (Age != other.Age)
			return false;
		if (Disease_ID != other.Disease_ID)
			return false;
		if (First_Name == null) {
			if (other.First_Name != null)
				return false;
		} else if (!First_Name.equals(other.First_Name))
			return false;
		if (Last_Name == null) {
			if (other.Last_Name != null)
				return false;
		} else if (!Last_Name.equals(other.Last_Name))
			return false;
		if (Patient_ID != other.Patient_ID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patients [Patient_ID=" + Patient_ID + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Age=" + Age + ", Disease_ID=" + Disease_ID + "]";
	}
}
