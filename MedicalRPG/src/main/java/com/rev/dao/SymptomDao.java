package com.rev.dao;

import java.util.List;

import com.rev.beans.Symptom;

public interface SymptomDao {
	//simple CRUD methods
	public Symptom getSymptombyID(int id);

	public List<Symptom> getAllSymptoms();

	public void updateSymptom(Symptom symptom);

	public void addSymptom(Symptom symptom);

	public void deleteSymptom(Symptom symptom);
}
