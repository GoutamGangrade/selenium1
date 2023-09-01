package com.selenium.a1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class synchronizationProblem {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
		
		WebDriver d=new ChromeDriver(co);
		
		d.manage().window().maximize();
		
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(2000);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		//Thread.sleep(2000);
		d.findElement(By.name("password")).sendKeys("admin123");
		//Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//Thread.sleep(2000);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul")).click();
		//Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
		
		
		
		Thread.sleep(5000);
		d.close();

	}

}
