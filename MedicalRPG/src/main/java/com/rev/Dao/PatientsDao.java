package com.rev.Dao;

import java.util.List;

import com.rev.Beans.Patients;

public interface PatientsDao {
	public Patients getPatientsbyID(int id);
	public List<Patients> getallPatients();
	public void updatePatients(Patients patients);
	public void addPatients(Patients patients);
	public void deletePatients(Patients patients);
}
