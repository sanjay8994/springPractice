package com.dgft.model;

import org.springframework.stereotype.Component;

@Component

public class RegModel {

	private String uname="" ;
	private String email="";
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
