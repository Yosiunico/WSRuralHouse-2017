package domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Customer implements Serializable {
	@Id
	private String username;
	private String password;
	
	public Customer(String username, String password) {
		this.username = username;
		this.password = password;
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
}
