package com.selenium.a1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blogspot_edge {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();


		d.manage().window().maximize();
		
		d.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
//		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isEnabled());
//		
//		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]")).isSelected());
//		
//		d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]")).click();		
//		
//		d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();
//
//		d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();
//		
//		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]")).isSelected());
//		
//		System.out.println(d.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]")).isSelected());
		
		JavascriptExecutor jsexecute=(JavascriptExecutor) d;
		jsexecute.executeScript("window.scrollBy(0, 100000)","");
	
		
	}

}
