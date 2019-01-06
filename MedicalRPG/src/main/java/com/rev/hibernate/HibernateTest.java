package com.rev.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	
	private static SessionFactory sesFac;
	

	public static SessionFactory getSession()
	{
		if(HibernateTest.sesFac == null)
		{
			Configuration config = new Configuration();
			config.setProperty("hibernate.connection.username", System.getenv("MedGame_DB_Username"));
			config.setProperty("hibernate.connection.password", System.getenv("MedGame_DB_Password"));
			config.setProperty("hibernate.connection.url", System.getenv("MedGame_DB_Url"));
			config.configure();			
			HibernateTest.sesFac = config.buildSessionFactory();
		}
		return HibernateTest.sesFac;
	}

}
