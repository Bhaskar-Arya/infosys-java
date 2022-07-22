package com.ui.dto;

public class OfficeDTO {
 
	private int office_id;
	private String city;
	private String street;
	public OfficeDTO(int office_id, String city, String street) {
		super();
		this.office_id = office_id;
		this.city = city;
		this.street = street;
	}
	public OfficeDTO() {
		super();
	}
	public int getOffice_id() {
		return office_id;
	}
	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "OfficeDTO [office_id=" + office_id + ", city=" + city + ", street=" + street + "]";
	}
	
}
