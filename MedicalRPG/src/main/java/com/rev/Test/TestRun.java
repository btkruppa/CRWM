package com.rev.Test;

import com.rev.Dao.PlayerDao;
import com.rev.DaoImpl.PlayerDaoImpl;
import com.rev.Singleton.Single;

public class TestRun {

	public TestRun() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		Single.instance().Dummy();
		PlayerDao use = new PlayerDaoImpl();
		//System.out.println(use.getallPlayers());	
		System.out.println(use.getPlayerbyID(10200));
	}

}
