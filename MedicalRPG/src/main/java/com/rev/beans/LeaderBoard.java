package com.rev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LEADERBOARD")
public class LeaderBoard {

	public LeaderBoard(int leaderBoard_ID, int uSER_ID, int sCORE) {
		super();
		LeaderBoard_ID = leaderBoard_ID;
		USER_ID = uSER_ID;
		SCORE = sCORE;
	}
	public LeaderBoard() {
	}
	@Id
	@Column(name="LEADERBOARD_ID")
	private int LeaderBoard_ID;
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private int USER_ID;
	@Column(name="SCORE")
	private int SCORE;
	public  int getLeaderBoard_ID() {
		return LeaderBoard_ID;
	}
	public void setLeaderBoard_ID(int leaderBoard_ID) {
		LeaderBoard_ID = leaderBoard_ID;
	}
	public int getUSER_ID() {
		return USER_ID;
	}
	public  void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public  int getSCORE() {
		return SCORE;
	}
	public  void setSCORE(int sCORE) {
		SCORE = sCORE;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + LeaderBoard_ID;
		result = prime * result + SCORE;
		result = prime * result + USER_ID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeaderBoard other = (LeaderBoard) obj;
		if (LeaderBoard_ID != other.LeaderBoard_ID)
			return false;
		if (SCORE != other.SCORE)
			return false;
		if (USER_ID != other.USER_ID)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LeaderBoard [LeaderBoard_ID=" + LeaderBoard_ID + ", USER_ID=" + USER_ID + ", SCORE=" + SCORE + "]";
	}
}
