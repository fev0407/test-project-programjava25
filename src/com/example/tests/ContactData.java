package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String homephone;
	public String mobilephone;
	public String workphone;
	public String email;
	public String email2;
	public String birthDay;
	public String birthMonth;
	public String birthYear;
	public String newgroup;
	public String address2;
	public String phone2;

	public ContactData() {
		}
	
	public ContactData(String firstname, String lastname, String address, String homephone, String mobilephone,
			String workphone, String email, String email2, String bday, String bmonth, String byear, String newgroup,
			String address2, String phone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.homephone = homephone;
		this.mobilephone = mobilephone;
		this.workphone = workphone;
		this.email = email;
		this.email2 = email2;
		this.birthDay = bday;
		this.birthMonth = bmonth;
		this.birthYear = byear;
		this.newgroup = newgroup;
		this.address2 = address2;
		this.phone2 = phone2;
	}
}