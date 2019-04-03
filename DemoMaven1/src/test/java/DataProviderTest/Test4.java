//import MercuryDemoTours;

package  DataProviderTest;
import DataProviderTest.ExcelApiTest3;

import subha.Facebook2;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
 
public class Test4
{

	public static WebDriver driver ; 
	public static String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
	public static String baseUrl = "http://www.newtours.demoaut.com/";

	 public static String UserName,Password;
	 
	 public static int numofrows;
	 
	 
	 @Test(dependsOnMethods={"Authentication1"})
	 public static void execute_allmethbods() throws Exception
	 {
		 
		  System.out.println("Authentication1()");
		
		 
	 }
	
	 @Test(dataProvider="Authentication1")
	 public static void Authentication1(String sTestCaseName,String sUserName,String sPassword) throws Exception
		{
			
			System.out.println(sTestCaseName); 
			Test2.openBrowser();
			Test2.mercurylogin(sUserName,sPassword);
			driver=OR3.driver;
			driver.quit();
			
		}
		
	
	
	 @DataProvider (name = "Authentication1")
	 
	    public static  Object[][] Authentication1() throws Exception{
		 
		// ExcelApiTest3 eat= new ExcelApiTest3();
	 
	         Object[][] testObjArray = ExcelApiTest3.getTableArray("E://Batch2Source//TestData.xls","Sheet1");
	        
	         System.out.println(testObjArray.length);
	         
	         numofrows=testObjArray.length;
	 
	         return (testObjArray); 
	 }
	 
	 

			 
}
			 
			 
			
					 

				 
