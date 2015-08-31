package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase{
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	  openMainPage();
      gotoGroupPage();
      initGroupCreation();
      GroupData group = new GroupData();
      group.name = "my first group";
      group.header = "header ek";
      group.footer = "footer ek";
	  fillGroupForm(group);
      submitGroupCreation();
      returnToGroupPage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  openMainPage();
      gotoGroupPage();
      initGroupCreation();
      fillGroupForm(new GroupData("", "", ""));
      submitGroupCreation();
      returnToGroupPage();
  }
}
