package com.rev.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.persistence.ConstraintMode;

/**
 * Summary *
 * Uses a one to many for fetching the information from player
 * Takes information in the object for the Leaderboard from sql
 * @author Darius
 */
@Entity
@Table(name="LEADERBOARD")
public class LeaderBoard {

	public LeaderBoard(int leaderBoard_ID, Set<Player> user_ID, int score) {
		super();
		this.leaderBoard_ID = leaderBoard_ID;
		this.players = user_ID;
		this.score = score;
	}
	public LeaderBoard() {
	}
	@Id
	@Column(name="LEADERBOARD_ID")
	private int leaderBoard_ID;
	@OneToMany(mappedBy="leader")
	private Set<Player> players;
	@Column(name="SCORE")
	private int score;
	public  int getLeaderBoard_ID() {
		return leaderBoard_ID;
	}
	public void setLeaderBoard_ID(int leaderBoard_ID) {
		this.leaderBoard_ID = leaderBoard_ID;
	}
	public  int getSCORE() {
		return this.score;
	}
	public  void setSCORE(int sCORE) {
		this.score = sCORE;
	}
	@Override
	public String toString() {
		return "LeaderBoard [LeaderBoard_ID=" + leaderBoard_ID + ", User_ID=" + players + ", SCORE=" + score + "]";
	}
	public Set<Player> getUser_ID() {
		return players;
	}
	public void setUser_ID(Set<Player> user_ID) {
		this.players = user_ID;
	}
}