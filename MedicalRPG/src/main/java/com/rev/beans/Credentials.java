package com.rev.beans;

///Summary///
///This object will take in the user input
///Taking in the username
public class Credentials {

public Credentials( String username, String password) {
		super();

		Username = username;
		Password = password;
	}

private String Username;
private String Password;


public String getUsername() {
	return Username;
}
public void setEmail(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Username == null) ? 0 : Username.hashCode());
	result = prime * result + ((Password == null) ? 0 : Password.hashCode());
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
	Credentials other = (Credentials) obj;
	if (Username == null) {
		if (other.Username != null)
			return false;
	} else if (!Username.equals(other.Username))
		return false;

	if (Password == null) {
		if (other.Password != null)
			return false;
	} else if (!Password.equals(other.Password))
		return false;
	return true;
}
@Override
public String toString() {
	return "Credentials [Email=" + Username + ", Password=" + Password + "]";
}
}