package com.selenium.a1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Blogspot {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\ggangrade\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");

		WebDriver d= new ChromeDriver(co);
		
		
		d.manage().window().maximize();
		
		d.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isEnabled());
		
		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isSelected());
		
		d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]")).click();		
		
		d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();

		d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();
		
		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]")).isSelected());
		
		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]")).isSelected());
		
		//scroll the page
		
		JavascriptExecutor jsexecute=(JavascriptExecutor) d;
		jsexecute.executeScript("window.scrollBy(0, 100000","");

		jsexecute.executeScript("window.scrollBy(0, -100000","");
	
	}

}
