package com.example.tests;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContactCreateTest extends TestBase {
  @Test
  public void testNonEmptyContactCreate() throws Exception {
    app.getNavigationHelper().openMainPage();
  
   
    // save old state
    List<ContactData> oldList = app.getContactHelper().getContacts();
  
    
    //actions
    app.getContactHelper().gotoContact();
    ContactData contact = new ContactData();
    contact.firstname = "Yna";
    contact.lastname = "Ivanova";
    contact.address = "SPb, Lensoveta 22-33";
    contact.homephone = "444-44-44";
    contact.mobilephone = "921-444-44-44";
    contact.workphone = "444-44-44";
    contact.email = "Irena.Ivanova@gmail.com";
    contact.email2 = "Ira.Ivanova@gmail.com";
    contact.birthDay = "2";
    contact.birthMonth = "January";
    contact.birthYear = "1998";
    contact.newgroup = "my first group";
    contact.address2 = "Rostov Lenina 15-4";
    contact.phone2 = "44-44-44";
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContact();
    app.getContactHelper().returnHomePage();
    
    //save new state
    List<ContactData> newList = app.getContactHelper().getContacts();
   // String numbercontact = app.getContactHelper().getNumContact();
    
    // compare states
   // assertEquals(newList.size(), oldList.size() + 1);
   // assertEquals(newList.size(), numbercontact);
    
    oldList.add(contact);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }
  
  //@Test
  public void testEmptyContactCreate() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().gotoContact();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "-", "", "", ""));
    app.getContactHelper().submitContact();
    app.getContactHelper().returnHomePage();
  }

}
