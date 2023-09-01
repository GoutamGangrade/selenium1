package com.selenium.a1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class browser1 {

	public static void main(String[] args) throws Exception {
		
		//chrome browser setup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
		// chrome driver obj
		WebDriver driver1= new ChromeDriver(co);
		driver1.manage().window().maximize();

		
		
		driver1.switchTo().newWindow(WindowType.TAB);
		driver1.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		 
//		driver1.get("https://www.google.co.in/");
//		driver1.navigate().to("https://www.medicaps.ac.in/");
		
//		WebElement gmailbtn = driver1.findElement(By.partialLinkText("Gmail"));
////		gmailbtn.click();
//		boolean isgmaillenable=gmailbtn.isEnabled();
//		System.out.println(isgmaillenable);
//		
//		System.out.println(gmailbtn.getAttribute("id"));
		
//		
//		WebElement searchboxelement= driver1.findElement(By.id("APjFqb"));
//		String valueofsearchboxid = searchboxelement.getAttribute("maxlength");
//		System.out.println(valueofsearchboxid);
		
//		WebElement searchboxelement= driver1.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a"));

//		WebElement searchboxelement= driver1.findElement(By.xpath("//*[starts-with(@id,'A')]"));
//		String valueofsearchboxid = searchboxelement.getAttribute("maxlength");
//		System.out.println(valueofsearchboxid);
		
//		WebElement cross= driver1.findElement(By.xpath("/html/body/div[2]/div/div/button"));
//		cross.click();
		
		driver1.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

 		driver1.findElement(By.name("q")).sendKeys("samsung galaxy f04",Keys.ENTER);
 		
// 		Set<String> handle=driver1.findElement(By.name("q")).sendKeys("samsung galaxy f04",Keys.ENTER);
// 		System.out.println(handle);
 		//Thread.sleep(3000);
 		
// 		driver1.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label")).click();

 		 
 		
 		//driver1.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]")).click();
 		//Thread.sleep(3000);
 		//driver1.findElement(By.);
 		
 		
		
		
		
	}

}
