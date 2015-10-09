package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase{
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().initGroupCreation();
      GroupData group = new GroupData();
      group.name = "my first group";
      group.header = "header ek";
      group.footer = "footer ek";
	  app.getGroupHelper().fillGroupForm(group);
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().returnToGroupPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
      app.getNavigationHelper().gotoGroupPage();
      app.getGroupHelper().initGroupCreation();
      app.getGroupHelper().fillGroupForm(new GroupData("", "", ""));
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().returnToGroupPage();
  }
}
