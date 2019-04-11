package com.kekemon.hrm.model;

import javax.persistence.*;

@Entity
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int employeeSL;

	@OneToOne(cascade = CascadeType.ALL)
	private PersonalData personalData;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Credential credential;

	public Employee() {}
	
	public Employee(PersonalData personalData, Credential credential) {
		setPersonalData(personalData);
		setCredential(credential);
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public Credential getCredential() {
		return credential;
	}

}