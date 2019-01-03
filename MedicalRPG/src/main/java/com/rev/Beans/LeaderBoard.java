package com.rev.Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LEADERBOARD")
public class LeaderBoard {

	public LeaderBoard() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="LEADERBOARD_ID")
	private int LEADERBOARD_ID;
	@Column(name="USER_ID")
	private int USER_ID;
	@Column(name="SCORE")
	private int SCORE;
}
