package com.tech.partially.injection.constructor;

public class Address {
	
	private String Area_Name;
	private String city_Name;
	
	
	public Address(String area_Name, String city_Name) {
		super();
		Area_Name = area_Name;
		this.city_Name = city_Name;
	}


	public String getArea_Name() {
		return Area_Name;
	}


	public String getCity_Name() {
		return city_Name;
	}


//	@Override
//	public String toString() {
//		return "Address [Area_Name=" + Area_Name + ", city_Name=" + city_Name + "]";
//	}


	

}
