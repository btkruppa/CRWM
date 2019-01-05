package com.rev.service;

import java.util.List;

import com.rev.beans.Credentials;
import com.rev.beans.Player;
import com.rev.dao.PlayerDao;
import com.rev.daoimpl.PlayerDaoImpl;

public class AuthenticationService {
	public Player isValidUser(Credentials cred)
	{
		PlayerDao pd = new PlayerDaoImpl();
		String user = cred.getEmail();
		String pass = cred.getPassword();
		Player play = null;
		List<Player> pl = pd.getAllPlayers();
		if(user != null && pass != null)
		{
			for(Player p : pl){
				if(user.equals(p.getEmail()) && pass.equals(p.getPassword()))
				{					
					play = p;
					return play;
				}
			}
		}
		return play;					
	}
}