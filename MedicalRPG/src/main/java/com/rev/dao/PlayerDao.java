package com.rev.dao;

import java.util.List;

import com.rev.beans.Player;

public interface PlayerDao {
	//simple CRUD methods
	public Player getPlayerByID(int id);

	public List<Player> getAllPlayers();

	public void updatePlayer(Player player);

	public void addPlayer(Player player);

	public void deletePlayer(Player player);
}