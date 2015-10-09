package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreateTest extends TestBase {
  @Test
  public void testNonEmptyContactCreate() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().gotoContact();
    ContactData contact = new ContactData();
    contact.firstname = "Alena";
    contact.lastname = "Ivanova";
    contact.address = "SPb, Lensoveta 22-33";
    contact.homephone = "111-11-11";
    contact.mobilephone = "921-222-22-22";
    contact.workphone = "333-33-33";
    contact.email = "Alena.Ivanova@gmail.com";
    contact.email2 = "Elena.Ivanova@gmail.com";
    contact.birthDay = "1";
    contact.birthMonth = "January";
    contact.birthYear = "1999";
    contact.newgroup = "my first group";
    contact.address2 = "Rostov Lenina 15-1";
    contact.phone2 = "11-11-11";
	app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContact();
    app.getContactHelper().returnHomePage();
  }
  
  @Test
  public void testEmptyContactCreate() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getContactHelper().gotoContact();
    app.getContactHelper().fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "-", "", "", ""));
    app.getContactHelper().submitContact();
    app.getContactHelper().returnHomePage();
  }

}
