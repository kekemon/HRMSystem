package com.kekemon.hrm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Credential {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int SL;
	
	@Column
	private String userName;
	private String passWord;
	
	public Credential(){}
	
	public Credential(String userName, String passWord) {
		setUserName(userName);
		setPassWord(passWord);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
