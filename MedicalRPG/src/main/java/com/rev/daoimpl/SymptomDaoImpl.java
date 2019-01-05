package com.rev.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rev.beans.Symptom;
import com.rev.dao.SymptomDao;
import com.rev.hibernate.HibernateUtil;

public class SymptomDaoImpl implements SymptomDao {
	
	// Session factory to obtain session
	SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public Symptom getSymptombyID(int id) {
		Symptom sp = null;
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			sp = (Symptom) s.get(Symptom.class, id);
			tx.commit();
			s.close();
		}
		return sp;
	}

	@Override
	public List<Symptom> getAllSymptoms() {
		List<Symptom> ls = new ArrayList<>();
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			ls = s.createQuery("from Symptom").getResultList();
			tx.commit();
			s.close();
		}
		return ls;
	}

	@Override
	public void updateSymptom(Symptom symptom) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.update(symptom);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void addSymptom(Symptom symptom) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.persist(symptom);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void deleteSymptom(Symptom symptom) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.delete(symptom);
			tx.commit();
			s.close();
		}
	}

}
