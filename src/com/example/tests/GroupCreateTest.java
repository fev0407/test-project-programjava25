package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase{
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	  app.navigationHelper.openMainPage();
      app.navigationHelper.gotoGroupPage();
      app.groupHelper.initGroupCreation();
      GroupData group = new GroupData();
      group.name = "my first group";
      group.header = "header ek";
      group.footer = "footer ek";
	  app.groupHelper.fillGroupForm(group);
      app.groupHelper.submitGroupCreation();
      app.groupHelper.returnToGroupPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  app.navigationHelper.openMainPage();
      app.navigationHelper.gotoGroupPage();
      app.groupHelper.initGroupCreation();
      app.groupHelper.fillGroupForm(new GroupData("", "", ""));
      app.groupHelper.submitGroupCreation();
      app.groupHelper.returnToGroupPage();
  }
}
