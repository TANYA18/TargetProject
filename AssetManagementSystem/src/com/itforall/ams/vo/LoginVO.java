package com.itforall.ams.vo;


import javax.servlet.http.Cookie;



public class LoginVO {

	private static String username;
	public Cookie getCookie() {
		return cookie;
	}
	public void setCookie(Cookie cookie) {
		this.cookie = cookie;
	}
	private static String password;
	Cookie cookie;
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
