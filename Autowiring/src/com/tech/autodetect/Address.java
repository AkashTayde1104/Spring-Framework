package com.tech.autodetect;

public class Address {
	private String area_Name;
	private String city_Name;

	public Address(String area_Name, String city_Name) {

		this.area_Name = area_Name;
		this.city_Name = city_Name;
	}

	public String getArea_Name() {
		return area_Name;
	}

	public void setArea_Name(String area_Name) {
		this.area_Name = area_Name;
	}

	public String getCity_Name() {
		return city_Name;
	}

	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}

	@Override
	public String toString() {
		return "Address [area_Name=" + area_Name + ", city_Name=" + city_Name + "]";
	}

}
