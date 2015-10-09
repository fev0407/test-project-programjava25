package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{
	
	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification(1);
		ContactData contact = new ContactData();
		contact.lastname = "new lastname";
		contact.homephone = "999-99-99";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().updateContact();
		app.getContactHelper().returnHomePage();
	}

}
