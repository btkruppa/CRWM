package com.rev.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

///Summary///
///Disease will take in information 
@Entity
@Table(name="DISEASE")
public class Disease {
	    
	@ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "DISEASE_SYMPTOM", 
	        joinColumns = { @JoinColumn(name = "DISEASE_ID") }, 
	        inverseJoinColumns = { @JoinColumn(name = "SYMPTOM_ID") }
	    )
	    Set<Symptom> symptom = new HashSet<>();

	public Disease(int disease_ID, String disease_NAME, String disease_DESCRIPTION) {
		super();
		Disease_ID = disease_ID;
		Disease_NAME = disease_NAME;
		Disease_DESCRIPTION = disease_DESCRIPTION;
	}
	public Disease() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="DISEASE_ID")
	private int Disease_ID;
	@Column(name="DISEASE_NAME")
	private String Disease_NAME;
	@Column(name="DISEASE_DESCRIPTION")
	private String Disease_DESCRIPTION;
	public  int getDisease_ID() {
		return Disease_ID;
	}
	public  void setDisease_ID(int disease_ID) {
		Disease_ID = disease_ID;
	}
	public  String getDisease_NAME() {
		return Disease_NAME;
	}
	public  void setDisease_NAME(String disease_NAME) {
		Disease_NAME = disease_NAME;
	}
	public  String getDisease_DESCRIPTION() {
		return Disease_DESCRIPTION;
	}
	public  void setDisease_DESCRIPTION(String disease_DESCRIPTION) {
		Disease_DESCRIPTION = disease_DESCRIPTION;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Disease_DESCRIPTION == null) ? 0 : Disease_DESCRIPTION.hashCode());
		result = prime * result + Disease_ID;
		result = prime * result + ((Disease_NAME == null) ? 0 : Disease_NAME.hashCode());
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
		Disease other = (Disease) obj;
		if (Disease_DESCRIPTION == null) {
			if (other.Disease_DESCRIPTION != null)
				return false;
		} else if (!Disease_DESCRIPTION.equals(other.Disease_DESCRIPTION))
			return false;
		if (Disease_ID != other.Disease_ID)
			return false;
		if (Disease_NAME == null) {
			if (other.Disease_NAME != null)
				return false;
		} else if (!Disease_NAME.equals(other.Disease_NAME))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Disease [Disease_ID=" + Disease_ID + ", Disease_NAME=" + Disease_NAME + ", Disease_DESCRIPTION="
				+ Disease_DESCRIPTION + "]";
	}
}
