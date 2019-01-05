package com.rev.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rev.beans.Player;
import com.rev.dao.PlayerDao;
import com.rev.hibernate.HibernateUtil;

public class PlayerDaoImpl implements PlayerDao {

	// Session factory to obtain session
	public SessionFactory sf = HibernateUtil.getSessionFactory();

	@Override
	public Player getPlayerByID(int id) {
		Player u = null;
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			u = (Player) s.get(Player.class, id);
			tx.commit();
			s.close();
		}
		return u;
	}

	@Override
	public List<Player> getAllPlayers() {
		List<Player> players = new ArrayList<>();
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			players = s.createQuery("from Player").getResultList();
			tx.commit();
			s.close();
		}
		return players;
	}

	@Override
	public void updatePlayer(Player player) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			// using s.update(object) until we need to do s.merge(object)
			s.update(player);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void addPlayer(Player player) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.persist(player);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void deletePlayer(Player player) {
		//
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.delete(player);
			tx.commit();
			s.close();
		}
	}
}