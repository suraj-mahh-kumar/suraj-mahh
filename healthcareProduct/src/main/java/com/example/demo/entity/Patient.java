package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	private String Patientname ;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Patientid ;
	private String PatientContactNo ;
	public String getPatientname() {
		return Patientname;
	}
	public void setPatientname(String patientname) {
		Patientname = patientname;
	}
	public Long getPatientid() {
		return Patientid;
	}
	public void setPatientid(Long patientid) {
		Patientid = patientid;
	}
	public String getPatientContactNo() {
		return PatientContactNo;
	}
	public void setPatientContactNo(String patientContactNo) {
		PatientContactNo = patientContactNo;
	}
	
}
