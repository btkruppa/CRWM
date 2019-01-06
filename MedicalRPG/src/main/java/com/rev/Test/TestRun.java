package com.rev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.rev.beans.Patients;
import com.rev.beans.Player;
import com.rev.hibernate.HibernateTest;

public class TestRun {

	public TestRun() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {

		//PlayerDao use = new PlayerDaoImpl();
		
		SessionFactory sf = HibernateTest.getSession();
		//System.out.println(use.getallPlayers());	
		//System.out.println(use.getPlayerbyID(10200));
		funWithCascade(sf);
		//funWithSessions(sf);
	}
	static void funWithSessions(SessionFactory sf)
	{
		Session s =sf.getCurrentSession();
		Transaction tx = s.beginTransaction();
		Player p1 = s.get(Player.class, 33);
		System.out.println(p1);
		Player p2 = s.get(Player.class, 34);
		System.out.println(p2);
		Player p3 = s.load(Player.class, 10360);
		System.out.println(p3);
		System.out.println(s.save(p3)); //adds a new one
		Player p4 = s.get(Player.class, 10360);
		p4.setUsername("Boom.com");
		tx.commit();
		s.close();
	}

	static void funWithCascade(SessionFactory sf)
	{
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Patients pat = (Patients) s.get(Patients.class, 1);
		System.out.println(pat.getFirst_Name());
		tx.commit();
		s.close();
	}
}
