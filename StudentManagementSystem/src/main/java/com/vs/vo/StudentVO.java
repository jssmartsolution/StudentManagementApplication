package com.vs.vo;

public class StudentVO{
	
	private String name;
	private String mobile;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
	

}
