package com.rev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

///Summary///
///Player information from login goes into here

//@NamedQueries(value = { @NamedQuery(name = "", query = "") })
@Entity
@Table(name="PLAYER")
public class Player {

	public Player()
	{
		
	}
	public Player(int id, String username, String password, String firstname, String lastname, int score, String isdev) {
		super();
		this.id = id;
		Username = username;
		Password = password;
		Score = score;
		Firstname = firstname;
		Lastname = lastname;
		this.isdev = isdev;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="playerSequence")
	@SequenceGenerator(allocationSize= 1,name="playerSequence",sequenceName="SQ_PLAYER_PK")
	@Column(name="PLAYER_ID")
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		result = prime * result + ((Username == null) ? 0 : Username.hashCode());
		result = prime * result + ((Firstname == null) ? 0 : Firstname.hashCode());
		result = prime * result + ((Lastname == null) ? 0 : Lastname.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		result = prime * result + Score;
		result = prime * result + id;
		result = prime * result + ((isdev == null) ? 0 : isdev.hashCode());
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
		if (Username == null) {
			if (other.Username != null)
				return false;
		} else if (!Username.equals(other.Username))
			return false;
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
		if (Score != other.Score)
			return false;
		if (id != other.id)
			return false;
		if (isdev == null) {
			if (other.isdev != null)
				return false;
		} else if (!isdev.equals(other.isdev))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", Username=" + Username + ", Password=" + Password + ", Score=" + Score + ", Firstname="
				+ Firstname + ", Lastname=" + Lastname + ", isdev=" + isdev + "]";
	}
}