package com.rev.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

<<<<<<< HEAD
/**
 * Summary *
 * Takes in symptom from sql symptoms table
 * Use a join table to connect the many to many operation to Disease
 * @author Darius
 */

=======
///Summary///
///Takes in symptom from sql symptoms table
///Use a join table to connect the many to many operation to Disease
>>>>>>> dev

@Entity
@Table(name="SYMPTOMS")
public class Symptom {
	    
	@ManyToMany(mappedBy = "symptom")
	   	private Set<Disease> diseases = new HashSet<>();
	     
	public Symptom(int symptom_ID, String symptom_Name, String symptom_Description, String is_Observable,
			String is_Testable, String symptom_Test) {
		super();
		Symptom_ID = symptom_ID;
		Symptom_Name = symptom_Name;
		Symptom_Description = symptom_Description;
		this.is_Observable = is_Observable;
		this.is_Testable = is_Testable;
		Symptom_Test = symptom_Test;
	}
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
	public synchronized int getSymptom_ID() {
		return Symptom_ID;
	}
	public synchronized void setSymptom_ID(int symptom_ID) {
		Symptom_ID = symptom_ID;
	}
	public synchronized String getSymptom_Name() {
		return Symptom_Name;
	}
	public synchronized void setSymptom_Name(String symptom_Name) {
		Symptom_Name = symptom_Name;
	}
	public synchronized String getSymptom_Description() {
		return Symptom_Description;
	}
	public synchronized void setSymptom_Description(String symptom_Description) {
		Symptom_Description = symptom_Description;
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
		return Symptom_Test;
	}
	public synchronized void setSymptom_Test(String symptom_Test) {
		Symptom_Test = symptom_Test;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Symptom_Description == null) ? 0 : Symptom_Description.hashCode());
		result = prime * result + Symptom_ID;
		result = prime * result + ((Symptom_Name == null) ? 0 : Symptom_Name.hashCode());
		result = prime * result + ((Symptom_Test == null) ? 0 : Symptom_Test.hashCode());
		result = prime * result + ((is_Observable == null) ? 0 : is_Observable.hashCode());
		result = prime * result + ((is_Testable == null) ? 0 : is_Testable.hashCode());
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
		Symptom other = (Symptom) obj;
		if (Symptom_Description == null) {
			if (other.Symptom_Description != null)
				return false;
		} else if (!Symptom_Description.equals(other.Symptom_Description))
			return false;
		if (Symptom_ID != other.Symptom_ID)
			return false;
		if (Symptom_Name == null) {
			if (other.Symptom_Name != null)
				return false;
		} else if (!Symptom_Name.equals(other.Symptom_Name))
			return false;
		if (Symptom_Test == null) {
			if (other.Symptom_Test != null)
				return false;
		} else if (!Symptom_Test.equals(other.Symptom_Test))
			return false;
		if (is_Observable == null) {
			if (other.is_Observable != null)
				return false;
		} else if (!is_Observable.equals(other.is_Observable))
			return false;
		if (is_Testable == null) {
			if (other.is_Testable != null)
				return false;
		} else if (!is_Testable.equals(other.is_Testable))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Symptom [Symptom_ID=" + Symptom_ID + ", Symptom_Name=" + Symptom_Name + ", Symptom_Description="
				+ Symptom_Description + ", is_Observable=" + is_Observable + ", is_Testable=" + is_Testable
				+ ", Symptom_Test=" + Symptom_Test + "]";
	}
}
