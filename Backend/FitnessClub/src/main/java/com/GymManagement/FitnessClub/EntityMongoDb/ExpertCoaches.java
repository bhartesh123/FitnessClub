package com.GymManagement.FitnessClub.EntityMongoDb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Coaches")
public class ExpertCoaches {
	
	private String c_email;
	private String c_name;
	@Id
	private long c_mobileNumber;
	
	public ExpertCoaches( String c_name, String c_email, long c_mobileNumber) {
		super();
		
		this.c_name = c_name;
		this.c_email = c_email;
		this.c_mobileNumber = c_mobileNumber;
	}
	public ExpertCoaches() {
		super();
	}
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public long getC_mobileNumber() {
		return c_mobileNumber;
	}
	public void setC_mobileNumber(long c_mobileNumber) {
		this.c_mobileNumber = c_mobileNumber;
	}
	
	
}
