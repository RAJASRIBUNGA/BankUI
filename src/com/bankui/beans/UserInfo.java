package com.bankui.beans;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class UserInfo {
	private String username;
	private Long id;
	private String password;
	private List<Role> roles;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", id=" + id + ", password=" + password + ", roles=" + roles + "]";
	}
	
}
