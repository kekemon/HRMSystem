package com.kekemon.hrm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonalData {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int SL;
	
	@Column
	private String employeeID;
	private String employeeName;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String employeeType;
	private String joinType;
	private String desigantion;
	private String functionalDesig;
	private String dateofBirth;
	private String dateofJoining;
	private String bloodgroup;
	private String dateofConfirmation;
	private String branch;
	private String division;
	private String department;
	private String gender;
	private String religion;
	private String meritalStatus;
	private String joiningDesignation;
	private String presentAddress;
	private String parmanentAddress;
	private String bankAC;
	private String mailAddress;
	private String mobileNo;
	private String PhoneNo;
	private String employeeFileNo;
	private String contructStartDate;
	private String contructEndDate;
	
	public PersonalData(){}
	
	public PersonalData(String employeeName) {
		setEmployeeName(employeeName);
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getJoinType() {
		return joinType;
	}

	public void setJoinType(String joinType) {
		this.joinType = joinType;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}

	public String getFunctionalDesig() {
		return functionalDesig;
	}

	public void setFunctionalDesig(String functionalDesig) {
		this.functionalDesig = functionalDesig;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(String dateofJoining) {
		this.dateofJoining = dateofJoining;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getDateofConfirmation() {
		return dateofConfirmation;
	}

	public void setDateofConfirmation(String dateofConfirmation) {
		this.dateofConfirmation = dateofConfirmation;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMeritalStatus() {
		return meritalStatus;
	}

	public void setMeritalStatus(String meritalStatus) {
		this.meritalStatus = meritalStatus;
	}

	public String getJoiningDesignation() {
		return joiningDesignation;
	}

	public void setJoiningDesignation(String joiningDesignation) {
		this.joiningDesignation = joiningDesignation;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getParmanentAddress() {
		return parmanentAddress;
	}

	public void setParmanentAddress(String parmanentAddress) {
		this.parmanentAddress = parmanentAddress;
	}

	public String getBankAC() {
		return bankAC;
	}

	public void setBankAC(String bankAC) {
		this.bankAC = bankAC;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getEmployeeFileNo() {
		return employeeFileNo;
	}

	public void setEmployeeFileNo(String employeeFileNo) {
		this.employeeFileNo = employeeFileNo;
	}

	public String getContructStartDate() {
		return contructStartDate;
	}

	public void setContructStartDate(String contructStartDate) {
		this.contructStartDate = contructStartDate;
	}

	public String getContructEndDate() {
		return contructEndDate;
	}

	public void setContructEndDate(String contructEndDate) {
		this.contructEndDate = contructEndDate;
	}
}
