package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserFaceBook {

		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			lanchBrowser();
			navigate();
			login();
			closeApplication();
		}
		private static void lanchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Test1\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try
			{
				oBrowser.get("https://www.facebook.com/login.php");
				Thread.sleep(8000);

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='email']")).sendKeys("deepti.rajal@gmail.com");
				oBrowser.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("9945795370");
				oBrowser.findElement(By.xpath("//*[@id=\'u_0_9_YB\']")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeApplication()
		{
			try
			{
				oBrowser.close();

			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}



	}