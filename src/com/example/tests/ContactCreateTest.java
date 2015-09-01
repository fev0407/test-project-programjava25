package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreateTest extends TestBase {
  @Test
  public void testNonEmptyContactCreate() throws Exception {
    openMainPage();
    gotoContact();
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
	fillContactForm(contact);
    submitContact();
    returnHomePage();
  }
  
  @Test
  public void testEmptyContactCreate() throws Exception {
    openMainPage();
    gotoContact();
    fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "-", "", "", ""));
    submitContact();
    returnHomePage();
  }

}
