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

///Summary///
///Uses a one to many for fetching the information from player
///Takes information in the object for the Leaderboard from sql

@Entity
@Table(name="LEADERBOARD")
public class LeaderBoard {

	public LeaderBoard(int leaderBoard_ID, Set<String> user_ID, int score) {
		super();
		LeaderBoard_ID = leaderBoard_ID;
		Username_ID = user_ID;
		SCORE = score;
	}
	public LeaderBoard() {
	}
	@Id
	@Column(name="LEADERBOARD_ID")
	private int LeaderBoard_ID;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="USERNAME",foreignKey=@ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private Set<String> Username_ID;
	@Column(name="SCORE")
	private int SCORE;
	public  int getLeaderBoard_ID() {
		return LeaderBoard_ID;
	}
	public void setLeaderBoard_ID(int leaderBoard_ID) {
		LeaderBoard_ID = leaderBoard_ID;
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
		result = prime * result + ((Username_ID == null) ? 0 : Username_ID.hashCode());
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
		if (Username_ID == null) {
			if (other.Username_ID != null)
				return false;
		} else if (!Username_ID.equals(other.Username_ID))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LeaderBoard [LeaderBoard_ID=" + LeaderBoard_ID + ", User_ID=" + Username_ID + ", SCORE=" + SCORE + "]";
	}
	public Set<String> getUser_ID() {
		return Username_ID;
	}
	public void setUser_ID(Set<String> user_ID) {
		Username_ID = user_ID;
	}
}
