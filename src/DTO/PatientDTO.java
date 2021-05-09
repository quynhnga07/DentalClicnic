package DTO;

import java.util.Date;

public class PatientDTO 
{
	private int id;
	private String name;
	private String iCard;
	private String gender;
	private String address;
	private String phone;
	private Date dayOfBirth;
	private String status;
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	
	public PatientDTO() 
	{
		
	}
	
	public PatientDTO(int id, String name, String iCard, String gender, String address, String phone, Date dayOfBirth,
			String status, Date createdDate, Date modifiedDate, String createdBy, String modifiedBy) {
		super();
		this.id = id;
		this.name = name;
		this.iCard = iCard;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.dayOfBirth = dayOfBirth;
		this.status = status;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getiCard() {
		return iCard;
	}
	public void setiCard(String iCard) {
		this.iCard = iCard;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDayOfBirth() {
		return dayOfBirth;
	}
	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
}
