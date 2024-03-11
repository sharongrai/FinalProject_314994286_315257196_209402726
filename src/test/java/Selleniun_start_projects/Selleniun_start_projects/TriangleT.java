package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TriangleT {
	
	static WebDriver  browser;
	
	@Before
	  public void setup() {
		 
			  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");

 } 
	@Test
	 public void NotTriangle() {
		 browser.findElement(By.name("side1")).sendKeys("0");
		 browser.findElement(By.name("side2")).sendKeys("0");
		 browser.findElement(By.name("side3")).sendKeys("0");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Error: Not a Triangle";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void EquilateralTriangle() {
		 browser.findElement(By.name("side1")).sendKeys("3");
		 browser.findElement(By.name("side2")).sendKeys("3");
		 browser.findElement(By.name("side3")).sendKeys("3");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Equilateral";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void IsoscelesTriangle() {
		 browser.findElement(By.name("side1")).sendKeys("6");
		 browser.findElement(By.name("side2")).sendKeys("6");
		 browser.findElement(By.name("side3")).sendKeys("5");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Isosceles";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
	
	@Test
	 public void ScaleneTriangle() {
		 browser.findElement(By.name("side1")).sendKeys("2");
		 browser.findElement(By.name("side2")).sendKeys("4");
		 browser.findElement(By.name("side3")).sendKeys("5");
		 
		 browser.findElement(By.id("identify-triangle-action")).click();
		 String result= browser.findElement(By.id("triangle-type")).getText().toString();
		 String Expected="Scalene";
		 assertEquals(Expected,result);
		 browser.close();
		 
	 }
}