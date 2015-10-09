package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.example.tests.ContactData;
import com.example.tests.TestBase;

public class ContactHelper extends HelperBase {
	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void fillContactForm(ContactData contact) {

		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.lastname);
		type(By.name("address"), contact.address);
	    type(By.name("home"), contact.homephone);
	    type(By.name("mobile"), contact.mobilephone);
	    type(By.name("work"), contact.workphone);
	    type(By.name("email"), contact.email);
	    type(By.name("email2"), contact.email2);
//	    SelectByText(By.name("bday"), contact.birthDay);
//	    SelectByText(By.name("bmonth"), contact.birthMonth);
	    type(By.name("byear"), contact.birthYear);
	    // SelectByText(By.name("new_group"), contact.newgroup);
	    type(By.name("address2"), contact.address2);
	    type(By.name("phone2"), contact.phone2);
	    
	}
	
	public void submitContact() {
		click(By.name("submit"));
	}

	public void returnHomePage() {
		click(By.linkText("home page"));
	}

	public void gotoContact() {
		click(By.linkText("add new"));
	}

	public void deleteContact(int index) {
		selectContactByIndex(index);
		click(By.xpath("(//img[@alt='Edit'])[" + index + "]")); 
		click(By.xpath("(//input[@name='update'])[2]"));
				
	}

	public void selectContactByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + index + "]"));
		
	}

	public void submitContactModification() {
		click(By.name("update"));
		
	}

	public void initContactModification(int index) {
		selectContactByIndex(index);
		click(By.xpath("(//img[@alt='Edit'])[" + index + "]"));
		
	}

	public void updateContact() {
		click(By.name("update"));
		
	}

}
