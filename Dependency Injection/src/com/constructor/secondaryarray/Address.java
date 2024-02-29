package com.constructor.secondaryarray;

public class Address {
	
	private String area_Name;
	private String city_Name;
	
	public Address(String area_Name, String city_Name) {
		super();
		this.area_Name = area_Name;
		this.city_Name = city_Name;
	}

	@Override
	public String toString() {
		return "Address [area_Name=" + area_Name + ", city_Name=" + city_Name + "]";
	}
	
	
	

}
