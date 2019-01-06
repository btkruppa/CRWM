package com.rev.dao;

import java.util.List;

import com.rev.beans.Patients;

public interface PatientsDao {
	public Patients getPatientsbyID(int id);
	public List<Patients> getallPatients();
	public void updatePatients(Patients patients);
	public void addPatients(Patients patients);
	public void deletePatients(Patients patients);
}
