package com.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newlogdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.logfile","./Chromelog.txt");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.close();

	}

}
