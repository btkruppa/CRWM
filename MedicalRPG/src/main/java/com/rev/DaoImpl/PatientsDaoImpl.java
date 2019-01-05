package com.rev.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rev.Beans.Patients;
import com.rev.Dao.PatientsDao;
import com.rev.Hibernate.HibernateTest;

public class PatientsDaoImpl implements PatientsDao {

	// Session factory to obtain session
	SessionFactory sf = HibernateTest.getSession();

	@Override
	public Patients getPatientsbyID(int id) {
		Patients p = null;
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			p = (Patients) s.get(Patients.class, id);
			tx.commit();
			s.close();
		}
		return null;
	}

	@Override
	public List<Patients> getAllPatients() {
		List<Patients> lp = new ArrayList<>();
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			lp = s.createQuery("from Patients").getResultList();
			tx.commit();
			s.close();
		}
		return lp;
	}

	@Override
	public void updatePatients(Patients patients) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.update(patients);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void addPatients(Patients patients) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.persist(patients);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void deletePatients(Patients patients) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.delete(patients);
			tx.commit();
			s.close();
		}
	}

}
