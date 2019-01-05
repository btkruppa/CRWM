package com.rev.test;
import static org.junit.Assert.assertFalse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.rev.beans.Credentials;
import com.rev.beans.Disease;
import com.rev.beans.Player;
import com.rev.beans.Symptom;
import com.rev.dao.PlayerDao;
import com.rev.daoimpl.PlayerDaoImpl;
import com.rev.service.AuthenticationService;

public class MedicalRPGTest {
	    private static SessionFactory sessionFactory;
	    private Session session;
	private static final PlayerDao playerDao = new PlayerDaoImpl();

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	/*@Test
	public void testGetAllPlayers() {
		List<Player> pList = new ArrayList<>();
		pList = playerDao.getallPlayers();
		assertEquals(10240, pList.get(4).getId());
	}
	@Test
	public void testGetAllPlayerByRealId() {
		Player testPlayer = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
		assertTrue(testPlayer.equals(playerDao.getPlayerbyID(10250)));
	}
	@Test
	public void testGetAllPlayerByUnknownId() {
		Player testPlayer = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
		assertFalse(testPlayer.equals(playerDao.getPlayerbyID(10)));
	}
	@Test
	public void testIsValidUserReal() {
		AuthenticationService auth = new AuthenticationService();
		Credentials cred = new Credentials("hdurrell0@indigo.com","yTXA0LXDON");
		Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
		assertEquals(p,auth.isValidUser(cred));
	}
	@Test
	public void testIsValidUserIncorrectEmail() {
		AuthenticationService auth = new AuthenticationService();
		Credentials cred = new Credentials("h@indigo.com","yTXA0LXDON");
		Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
		assertFalse(p.equals(auth.isValidUser(cred)));
	}/*
	@Test
	public void testIsValidUserIncorrectPassword() {
		AuthenticationService auth = new AuthenticationService();
		Credentials cred = new Credentials("hdurrell0@indigo.com","y");
		Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
		assertFalse(p.equals(auth.isValidUser(cred)));
	}
	@Test
	public void testIsValidUserNullCredentials() {
		AuthenticationService auth = new AuthenticationService();
		Credentials cred = new Credentials(null,null);
		Player p = new Player(10250, "hdurrell0@indigo.com","yTXA0LXDON","Herby","Durrell",796121652,"false");
		assertFalse(p.equals(auth.isValidUser(cred)));
	}*/
}