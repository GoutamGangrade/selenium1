package com.selenium.a1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Indori {

	public static void main(String[] args) throws Exception {
				//chrome browser setup
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions co=new ChromeOptions();
				co.setBinary("C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
				// chrome driver obj
				WebDriver d= new ChromeDriver(co);
				
				//maximize the window
				d.manage().window().maximize();
				
				d.get("https://www.redbus.in/");
				
				d.findElement(By.tagName("html")).sendKeys(Keys.ESCAPE);
				
				d.findElement(By.xpath("//*[@id=\"rail_tickets_vertical\"]")).click();
				Thread.sleep(3000);
				

				d.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Mumbai - All Stations");
				Thread.sleep(3000);
				d.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/div/div/div/div[1]")).click();
				Thread.sleep(3000);
				
				d.findElement(By.xpath("//*[@id=\"dst\"]")).sendKeys("Pune Jn");
				Thread.sleep(3000);
				d.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/div/div/div/div[1]")).click();
				d.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div[2]/div[3]/div/form/button")).click();
				
				

				List<WebElement> data1 =  d.findElements(By.className("srp_train_name_code"));
				        for(WebElement element :data1){
				            	System.out.println(element.getText());
				       }				
				
				Thread.sleep(3000);
				//d.quit();				

	}

}
