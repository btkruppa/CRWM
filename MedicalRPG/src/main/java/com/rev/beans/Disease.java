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


/**
 * Summary*
 * Disease will take in information from the disease table
 * We have a Many to many join table with Symptoms so that many diseases can have many symptoms
 * @author Darius
 */

@Entity
@Table(name="DISEASES")
public class Disease {
	    
	@ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "DISEASE_SYMPTOMS", 
	        joinColumns = { @JoinColumn(name = "DISEASE_ID") }, 
	        inverseJoinColumns = { @JoinColumn(name = "SYMPTOM_ID") }
	    )
	    Set<Symptom> symptom = new HashSet<>();

	public Disease(int disease_id, String disease_name, String disease_description) {
		super();
		this.disease_id = disease_id;
		this.disease_name = disease_name;
		this.disease_description = disease_description;
	}
	public Disease() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="DISEASE_ID")
	private int disease_id;
	@Column(name="DISEASE_NAME")
	private String disease_name;
	@Column(name="DISEASE_DESCRIPTION")
	private String disease_description;
	public  int getDisease_Id() {
		return disease_id;
	}
	public  void setDisease_Id(int disease_id) {
		this.disease_id = disease_id;
	}
	public  String getDisease_Name() {
		return disease_name;
	}
	public  void setDisease_NAME(String disease_name) {
		this.disease_name = disease_name;
	}
	public  String getDisease_Description() {
		return disease_description;
	}
	public  void setDisease_DESCRIPTION(String disease_description) {
		this.disease_description = disease_description;
	}
	@Override
	public String toString() {
		return "Disease [symptom=" + symptom + ", disease_id=" + disease_id + ", disease_name=" + disease_name
				+ ", disease_description=" + disease_description + "]";
	}

}
