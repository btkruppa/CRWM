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


///Summary///
///Player information from login goes into here

//@NamedQueries(value = { @NamedQuery(name = "", query = "") })
@Entity
@Table(name="PLAYER")
public class Player {

	public Player()
	{
		
	}
<<<<<<< HEAD
	public Player(int id, String username, String password, String firstname, String lastname, int score, String isdev, LeaderBoard leader) {
=======
	public Player(int id, String username, String password, String firstname, String lastname, int score, String isdev,LeaderBoard leader) {
>>>>>>> 8387bda14dcc39dbf31634ae4616a78ba413994d
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.score = score;
		this.firstname = firstname;
		this.lastname = lastname;
		this.isdev = isdev;
		this.leader = leader;
	}
	
	@Id
	/*@GeneratedValue(strategy=GenerationType.AUTO, generator="playerSequence")
	@SequenceGenerator(allocationSize= 1,name="playerSequence",sequenceName="SQ_PLAYER_PK")*/
	@Column(name="PLAYER_ID")
	private int id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PLAYER_PASSWORD")
	private String password;
	@Column(name="HIGH_SCORES")
	private int score;
	@Column(name="FIRST_NAME")
	private String firstname;
	@Column(name="LAST_NAME")
	private String lastname;
	@Column(name="IS_DEV")
	private String isdev;
	@ManyToOne
	@JoinColumn(name="LeaderBoard_ID")
	private LeaderBoard leader;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getIsdev() {
		return isdev;
	}
	public void setIsdev(String isdev) {
		this.isdev = isdev;
	}
	public LeaderBoard getLeader() {
		return leader;
	}
	public void setLeader(LeaderBoard leader) {
		this.leader = leader;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", username=" + username + ", password=" + password + ", score=" + score
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", isdev=" + isdev + ", leader=" + leader
				+ "]";
	}
	public LeaderBoard getLeader() {
		return leader;
	}
	public void setLeader(LeaderBoard leader) {
		this.leader = leader;
	}
}