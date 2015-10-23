package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{
	
	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
		
		// save old state
	    List<ContactData> oldList = app.getContactHelper().getContacts();
			    
	    //actions
		app.getContactHelper().initContactModification(0);
		ContactData contact = new ContactData();
		contact.firstname = "Lada";
		contact.homephone = "999-99-99";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().updateContact();
		app.getContactHelper().returnHomePage();
		
		//save new state
	    List<ContactData> newList = app.getContactHelper().getContacts();
		
		// compare states
		  		    
		 oldList.remove(0);
		 oldList.add(contact);
		 Collections.sort(oldList);
		 assertEquals(newList, oldList);
	}

}
