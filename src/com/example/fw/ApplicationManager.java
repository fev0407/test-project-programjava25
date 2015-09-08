package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
	
	public String baseUrl;
	public WebDriver driver;
	
	public NavigationHelper navigationHelper;
	public GroupHelper groupHelper;
	public ContactHelper contactHelper;
	
	
	public ApplicationManager() {
		//����������� ��� �������� �������
		driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    navigationHelper=new NavigationHelper(this);
	    groupHelper = new GroupHelper(this);
	    contactHelper = new ContactHelper(this);
	}

	public void stop() {
		driver.quit();
	    
	}

}