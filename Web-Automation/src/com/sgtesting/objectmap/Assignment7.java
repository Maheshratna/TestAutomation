package com.sgtesting.objectmap;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {


public static WebDriver oBrowser=null;
	
	public static String path=System.getProperty("user.dir");
	public static String filename=path+"\\ObjectMap\\objectmap.properties";
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		deletecustomer();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", "E:\\CurrentWorkSpace\\TestAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginusernametxtfield")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpasswordtxtfield")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageminimizeflyoutwin")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createcustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("createcustomerfield")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonaddnewbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickoncreatebutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("entercustomernamefield")).sendKeys("demouser");
			oBrowser.findElement(objectmap.getLocator("savecreatedcustomer")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createproject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clickonaddnewbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createprojectpage")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("enterprojectnamefield")).sendKeys("demoproject");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savecreatedproject")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createtask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("createtaskpagebutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createnewtaskpagebutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("tasknamefolderpagefield")).sendKeys("Assignment on objectmap");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savecreatedtaskpage")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletetask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("deletecreatedtaskpage")).click();
			Thread.sleep(1000);	
			oBrowser.findElement(objectmap.getLocator("clickondeleteactiontaskpage")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickondeletetaskpagebuttontodelete")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonpermanentdeletebutton")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteproject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("deletecreatedproject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonactionprojectdeletebuton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickondeleteproject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectpermanentdelete")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("deletecreatedcustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonactionbutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickondeletebutton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("clickonpermanentdelete")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void closeApplication()
	{
		
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

}
