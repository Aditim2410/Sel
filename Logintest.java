package com.testpackage;

import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest {
	
	Logger Log = Logger.getLogger(Logintest.class);
	
	//PropertyConfigurator.configure("log4j.properties");
	
	//to generate logs demo
	//info
	//warn
	//error
	//warn



	
	@BeforeSuite
	
	public void setup()
	{
		System.out.println("system property available");
	}
	
	@BeforeClass
	
	
	public void launchbrowser()
	{
		System.out.println("browser launched");
		Log.debug("hi");
	
	}

	
	@BeforeTest
	
	public void login()
	{
		System.out.println();
	}

	@Test
	
	public void GoogleTestTitle()
	{
		System.out.println("Title Verified");
	}
	
	@AfterMethod
	
	public void Logout()
	{
		System.out.println("logout successfully");
	}
	
	@AfterSuite
	
	public void close()
	
	{
		System.out.println("Browser is closed");
	}
	
}

		

	


