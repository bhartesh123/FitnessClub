package com.GymManagement.FitnessClub.EntityMongoDb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Members")
public class ClubMemberDetails {
	@Id
	private long m_mobileNumber;
	private String m_firstName;
	private String m_lastName;
	private String m_address;
	private String m_emailId;
	private Date m_dateOfBirth;
	private String m_gender;
	private String m_city;
	private String m_zip;
	private String m_medicalHealth;
	private float m_height;
	private float m_weight;
	private float m_chestSize;
	private float m_thighSize;
	
	public ClubMemberDetails(long m_mobileNumber, String m_firstName, String m_lastName, String m_address, String m_emailId,
			Date m_dateOfBirth, String m_gender, String m_city, String m_zip, String m_medicalHealth, float m_height,
			float m_weight, float m_chestSize, float m_thighSize) {
		super();
		this.m_mobileNumber = m_mobileNumber;
		this.m_firstName = m_firstName;
		this.m_lastName = m_lastName;
		this.m_address = m_address;
		this.m_emailId = m_emailId;
		this.m_dateOfBirth = m_dateOfBirth;
		this.m_gender = m_gender;
		this.m_city = m_city;
		this.m_zip = m_zip;
		this.m_medicalHealth = m_medicalHealth;
		this.m_height = m_height;
		this.m_weight = m_weight;
		this.m_chestSize = m_chestSize;
		this.m_thighSize = m_thighSize;
	}

	public ClubMemberDetails() {
		super();
	}

	public long getM_mobileNumber() {
		return m_mobileNumber;
	}

	public void setM_mobileNumber(long m_mobileNumber) {
		this.m_mobileNumber = m_mobileNumber;
	}

	public String getM_firstName() {
		return m_firstName;
	}

	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}

	public String getM_lastName() {
		return m_lastName;
	}

	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public String getM_emailId() {
		return m_emailId;
	}

	public void setM_emailId(String m_emailId) {
		this.m_emailId = m_emailId;
	}

	public Date getM_dateOfBirth() {
		return m_dateOfBirth;
	}

	public void setM_dateOfBirth(Date m_dateOfBirth) throws ParseException {
		//m_dateOfBirth.formate(dateTimeFormatter);
		//DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//String formattedDate= m_dateOfBirth.format(dateTimeFormatter);
		System.out.println("Before Formate : "+m_dateOfBirth);
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate= dateFormat.format(m_dateOfBirth);
		System.out.println("Date 1 : "+formattedDate);
		//Date temp= new SimpleDateFormat("yyyy/MM/dd").parse(formattedDate);
		//DateFormat formatter= new SimpleDateFormat("yyyy/MM/dd");
		//Date temp=(Date) formatter.parse(formattedDate);
		LocalDate date=LocalDate.parse(formattedDate,DateTimeFormatter.ISO_DATE);
		System.out.println("Formatted Date is : "+date);
		Date temp=java.sql.Date.valueOf(date);
		System.out.println("Final Date is : "+temp);
		this.m_dateOfBirth = temp;
	}

	public String getM_gender() {
		return m_gender;
	}

	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}

	public String getM_city() {
		return m_city;
	}

	public void setM_city(String m_city) {
		this.m_city = m_city;
	}

	public String getM_zip() {
		return m_zip;
	}

	public void setM_zip(String m_zip) {
		this.m_zip = m_zip;
	}

	public String getM_medicalHealth() {
		return m_medicalHealth;
	}

	public void setM_medicalHealth(String m_medicalHealth) {
		this.m_medicalHealth = m_medicalHealth;
	}

	public float getM_height() {
		return m_height;
	}

	public void setM_height(float m_height) {
		this.m_height = m_height;
	}

	public float getM_weight() {
		return m_weight;
	}

	public void setM_weight(float m_weight) {
		this.m_weight = m_weight;
	}

	public float getM_chestSize() {
		return m_chestSize;
	}

	public void setM_chestSize(float m_chestSize) {
		this.m_chestSize = m_chestSize;
	}

	public float getM_thighSize() {
		return m_thighSize;
	}

	public void setM_thighSize(float m_thighSize) {
		this.m_thighSize = m_thighSize;
	}
	
	
	
	
}
