package x_PathAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProgramming {
   public static WebDriver obrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
	//	entersalaryforthepersonsachintendulkar();
	//	FromPersonRahulDravidTheNextSecondRecordEntersalary();
	//	 makeStatusAsActiveForIndianFreedomFighter();
		 fromSachinTendulkarPrevious2ndRecordMakeStatusActive();
	//	 basedOnRefOfSalaryFieldInSachinTendularRecordIdentfyTable();
		// basedOnTableReferenceEnterSalaryOn4thRecord();
		
	}
	static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\Example Automation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
		obrowser.get("file:///E:/Example%20Automation/WebTableHTML.html");	
		Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void entersalaryforthepersonsachintendulkar()
	{
		try
		{
			obrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("20000");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void FromPersonRahulDravidTheNextSecondRecordEntersalary()
	{
		try
		{
			obrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("25000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void makeStatusAsActiveForIndianFreedomFighter()
	{
		try
		{
			obrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[2]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void fromSachinTendulkarPrevious2ndRecordMakeStatusActive()
	{
		try
		{
			obrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td[1]/input")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void basedOnRefOfSalaryFieldInSachinTendularRecordIdentfyTable()
	{
		try
		{
			WebElement oEle=obrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
			String val=oEle.getAttribute("id");
			System.out.println(val);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void basedOnTableReferenceEnterSalaryOn4thRecord()
	{
		try
		{
			obrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("25000");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
