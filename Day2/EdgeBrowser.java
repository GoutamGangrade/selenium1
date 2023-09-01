package com.selenium.a1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowser {

	public static void main(String[] args) {

		//edge browser setup
		WebDriverManager.edgedriver().setup();
		
		//chrome driver obj
		WebDriver driver2=new EdgeDriver();
		
//		driver2.get("https://www.google.com/");
		
		//maximize
		driver2.manage().window().maximize();
//		
//		//
////		driver2.get("https://www.medicaps.ac.in/");
////		
////		driver2.navigate().back();
////		Thread.sleep(3000);
////		driver2.navigate().forward();
////		driver2.navigate().refresh();
////		//driver2.getTitle();
//		
////		String title=driver2.getTitle();
////		
////		System.out.println(title);
////		
////		String pagesouirce=driver2.getPageSource();
////		System.out.println(pagesouirce.length());
//////		driver2.close();
//////		driver2.quit();
////		
////		
////		Set<String> handle= driver2.getWindowHandles();
////		System.out.println(handle);
//		
////		driver2.switchTo().newWindow(WindowType.TAB);
////		driver2.get("https://www.google.com/");
////		driver2.findElement(By.name("q")).sendKeys("medicaps",Keys.ENTER);
//////		driver2.findElement(By.className("gNO89b")).submit();
////		
////		
////		driver2.switchTo().newWindow(WindowType.TAB);
////		driver2.get("https://www.google.com/");
////		driver2.findElement(By.name("q")).sendKeys("www.youtube.com",Keys.ENTER);
////
////		driver2.switchTo().newWindow(WindowType.TAB);
////		driver2.get("https://www.google.com/");
////		driver2.findElement(By.name("q")).sendKeys("www.bing.com",Keys.ENTER);	
//		
//		driver2.switchTo().newWindow(WindowType.TAB);
//		driver2.get("https://www.google.com/");
//		
////		WebElement gmailbtn = driver2.findElement(By.partialLinkText("Gmail"));
//		
//		
//		WebElement gmailbtn= driver2.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
//		gmailbtn.click();
//		
//		////*[@id="gb"]/div/div[1]/div/div[1]/a
		
		driver2.switchTo().newWindow(WindowType.TAB);
		driver2.get("https://www.flipkart.com/");
		
		driver2.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		driver2.findElement(By.name("q")).sendKeys("moblie",Keys.ENTER);
 		//Thread.sleep(3000);
		 		
		driver2.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label")).click();
		
		 		 
		 		
		//driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]")).click();
		//Thread.sleep(3000);
		//driver1.findElement(By.);
		
		
		
		
		
		

	}

}
