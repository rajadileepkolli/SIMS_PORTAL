package com.sims.portal.beans;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {
	
	@NotEmpty(message = "{login.username.empty}")
	private String username;
	
	@NotEmpty(message = "{login.password.empty}")
	private String password;
	
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
