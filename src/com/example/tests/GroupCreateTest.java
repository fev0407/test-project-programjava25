package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GroupCreateTest extends TestBase{
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
      app.getNavigationHelper().gotoGroupPage();
      
      // save old state
      List<GroupData> oldList = app.getGroupHelper().getGroups();
      
      //actions
      app.getGroupHelper().initGroupCreation();
      GroupData group = new GroupData();
      group.name = "aaa";
      group.header = "header ek2";
      group.footer = "footer ek2";
	  app.getGroupHelper().fillGroupForm(group);
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().returnToGroupPage();
      
      //save new state
      List<GroupData> newList = app.getGroupHelper().getGroups();
      
      // compare states
      //assertEquals(newList.size(), oldList.size() + 1);
      
      oldList.add(group);
      Collections.sort(oldList);
      assertEquals(newList, oldList);    
      
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
	  app.getNavigationHelper().openMainPage();
      app.getNavigationHelper().gotoGroupPage();
      
      // save old state
      List<GroupData> oldList = app.getGroupHelper().getGroups();
      
      // actions
      GroupData group = new GroupData("", "", "");
      app.getGroupHelper().initGroupCreation();
      app.getGroupHelper().fillGroupForm(group);
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().returnToGroupPage();
      
      //save new state
      List<GroupData> newList = app.getGroupHelper().getGroups();
      
      // compare states
            
      oldList.add(group);
      Collections.sort(oldList);
      assertEquals(newList, oldList);  
  }
}
