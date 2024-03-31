package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.System;

public class calculatorT {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		      browser.get(url);
		
	  } 
	 
	 @Test
	 public void PlusCheck() {
		 browser.findElement(By.id("button01")).click();

		 browser.findElement(By.id("buttonplus")).click();
		 browser.findElement(By.id("button02")).click();
		 browser.findElement(By.id("buttonequals")).click();

		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "3";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 @Test
	 public void PlusCheck2() {
		 browser.findElement(By.id("button06")).click();

		 browser.findElement(By.id("buttonplus")).click();
		 browser.findElement(By.id("button08")).click();
		 browser.findElement(By.id("buttonequals")).click();

		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "14";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void MinusCheck() {
		 browser.findElement(By.id("button07")).click();
		 browser.findElement(By.id("buttonminus")).click();
		 browser.findElement(By.id("button03")).click();
		 browser.findElement(By.id("buttonequals")).click();

		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "4";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void MinusCheck2() {
		 browser.findElement(By.id("button05")).click();
		 browser.findElement(By.id("button00")).click();
		 browser.findElement(By.id("buttonminus")).click();
		 browser.findElement(By.id("button02")).click();
		 browser.findElement(By.id("button05")).click();
		 browser.findElement(By.id("buttonequals")).click();

		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "25";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void multiCheck() {
		 browser.findElement(By.id("button02")).click();
		 browser.findElement(By.id("buttonmultiply")).click();
		 browser.findElement(By.id("button01")).click();
		 browser.findElement(By.id("button05")).click();
		 browser.findElement(By.id("buttonequals")).click();


		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "30";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void multiCheck2() {
		 browser.findElement(By.id("button03")).click();
		 browser.findElement(By.id("buttonmultiply")).click();
		 browser.findElement(By.id("button04")).click();
		 browser.findElement(By.id("buttonequals")).click();


		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "12";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void divisionCheck() {
		 browser.findElement(By.id("button03")).click();
		 browser.findElement(By.id("button06")).click();
		 browser.findElement(By.id("buttondivide")).click();
		 browser.findElement(By.id("button06")).click();
		 browser.findElement(By.id("buttonequals")).click();

		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "6";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 @Test
	 public void divisionCheck2() {
		 browser.findElement(By.id("button02")).click();
		 browser.findElement(By.id("button00")).click();
		 browser.findElement(By.id("buttondivide")).click();
		 browser.findElement(By.id("button05")).click();
		 browser.findElement(By.id("buttonequals")).click();

		 String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		 String Expected= "4";
		 assertEquals(Expected,result);
		 browser.close();
	 }
	 
	 
	 
	 
}
	 