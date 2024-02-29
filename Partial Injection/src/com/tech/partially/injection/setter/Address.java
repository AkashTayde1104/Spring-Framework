package com.tech.partially.injection.setter;

public class Address {

	private String Area_Name;
	private String city_Name;

//	@Override
//	public String toString() {
//		return "Address [Area_Name=" + Area_Name + ", city_Name=" + city_Name + "]";
//	}

	public String getArea_Name() {
		return Area_Name;
	}

	public void setArea_Name(String area_Name) {
		Area_Name = area_Name;
	}

	public String getCity_Name() {
		return city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

}
