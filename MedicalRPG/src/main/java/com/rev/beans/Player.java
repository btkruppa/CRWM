package com.rev.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;

/**
 * Summary *
 * Player information from login goes into here
 * @author Darius
 */

@Entity
@Table(name="PLAYER")
public class Player {
	public Player()
	{
		
	}

public Player(int player_ID, String username, String password, int score, String firstname, String lastname,
		String isdev, LeaderBoard leader) {
		super();
		Player_ID = player_ID;
		Username = username;
		Password = password;
		Score = score;
		Firstname = firstname;
		Lastname = lastname;
		this.isdev = isdev;
		this.leader = leader;
	}
	@Id
	/*@GeneratedValue(strategy=GenerationType.AUTO, generator="playerSequence")
	@SequenceGenerator(allocationSize= 1,name="playerSequence",sequenceName="SQ_PLAYER_PK")*/
	@Column(name="PLAYER_ID")
	private int Player_ID;
	@Column(name="USERNAME")
	private String Username;
	@Column(name="PLAYER_PASSWORD")
	private String Password;
	@Column(name="HIGH_SCORES")
	private int Score;
	@Column(name="FIRST_NAME")
	private String Firstname;
	@Column(name="LAST_NAME")
	private String Lastname;
	@Column(name="IS_DEV")
	private String isdev;
	@ManyToOne
	@JoinColumn(name="LeaderBoard_ID")
	private LeaderBoard leader;
	
	public int getId() {
		return Player_ID;
	}
	public void setId(int id) {
		this.Player_ID = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getIsdev() {
		return isdev;
	}
	public void setIsdev(String isdev) {
		this.isdev = isdev;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Firstname == null) ? 0 : Firstname.hashCode());
		result = prime * result + ((Lastname == null) ? 0 : Lastname.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + Player_ID;
		result = prime * result + Score;
		result = prime * result + ((Username == null) ? 0 : Username.hashCode());
		result = prime * result + ((isdev == null) ? 0 : isdev.hashCode());
		result = prime * result + ((leader == null) ? 0 : leader.hashCode());
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
		Player other = (Player) obj;
		if (Firstname == null) {
			if (other.Firstname != null)
				return false;
		} else if (!Firstname.equals(other.Firstname))
			return false;
		if (Lastname == null) {
			if (other.Lastname != null)
				return false;
		} else if (!Lastname.equals(other.Lastname))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		if (Player_ID != other.Player_ID)
			return false;
		if (Score != other.Score)
			return false;
		if (Username == null) {
			if (other.Username != null)
				return false;
		} else if (!Username.equals(other.Username))
			return false;
		if (isdev == null) {
			if (other.isdev != null)
				return false;
		} else if (!isdev.equals(other.isdev))
			return false;
		if (leader == null) {
			if (other.leader != null)
				return false;
		} else if (!leader.equals(other.leader))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Player [Player_ID=" + Player_ID + ", Username=" + Username + ", Password=" + Password + ", Score="
				+ Score + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", isdev=" + isdev + ", leader="
				+ leader + "]";
	}
	public synchronized int getPlayer_ID() {
		return Player_ID;
	}
	public synchronized void setPlayer_ID(int player_ID) {
		Player_ID = player_ID;
	}
	public synchronized LeaderBoard getLeader() {
		return leader;
	}
	public synchronized void setLeader(LeaderBoard leader) {
		this.leader = leader;
	}
}