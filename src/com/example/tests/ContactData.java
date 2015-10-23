package com.example.tests;

public class ContactData implements Comparable<ContactData>{
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

	@Override
	public int compareTo(ContactData other) {
		return this.firstname.toLowerCase().compareTo(other.firstname.toLowerCase());
	}

	@Override
	public String toString() {
		return "ContactData [firstname=" + firstname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}
	
	
	
}