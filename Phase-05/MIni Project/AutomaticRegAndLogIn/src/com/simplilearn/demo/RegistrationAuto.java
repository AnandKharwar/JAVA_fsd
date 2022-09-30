package com.simplilearn.demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class RegistrationAuto {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ANAND drive\\Phase 5\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		 driver.manage().window().maximize();

			System.out.println("Title:"+driver.getTitle());
			
			System.out.println("------------------------");
		
		
		//Name
		      WebElement name= driver.findElement(By.id("id_name"));
		       name.sendKeys("Anand Kharwar");
		       System.out.println(name.getAttribute("name"));
		       
		       
		
		//email
				WebElement email = driver.findElement(By.id("id_email"));
				email.sendKeys("anand@gmail.com");
				System.out.println(email.getAttribute("id"));
				
				
				
	    //mobile
				WebElement mobile = driver.findElement(By.id("id_cell_phone"));
				mobile.sendKeys("7890123456");
				System.out.println(mobile.getAttribute("id"));
				
				
		//password
				
				WebElement pass = driver.findElement(By.id("id_password"));
				pass.sendKeys("Anand@12345");
				System.out.println(pass.getAttribute("id"));
				
				
				
		//button

				WebElement register = driver.findElement(By.cssSelector("#registerButton"));
				register.click();		
		  
				
				
				System.out.println("Form Summited Sucessfully!!");
	}
	
}
