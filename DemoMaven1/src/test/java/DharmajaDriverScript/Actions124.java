package DharmajaDriverScript;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
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

public class Actions124 {
	
	public String baseUrl = "https://www.facebook.com/";
	String driverPath = "C:\\Users\\sudhakar\\Desktop\\seleni\\chromedriver_win32\\chromedriver.exe";
    static WebDriver driver ; 
	
	
	public static void AmazonOpenBrowser1()
	{
		System.out.println("Amazon OpenBrowser Execution started");	
		Amazon.OpenBrowser();
		
	}
	
	public static void AmazonHelloSignIn1()
	{
		System.out.println("Amazon Hello Sign  started");	
			Amazon.HelloSignIn();
		
	}
	
	public static void AmazonLogin1()
	{
		System.out.println("Amazon Login1  started");	
		Amazon.Login();
	
	}
	
	public static void AmazonLogout1()
	{
		System.out.println("Amazon Logout1  started");
		Amazon.Logout();
		
	}
	
	public static void AmazonCloseBrowser1()
	{
		System.out.println("Amazon CloseBrowser1 started");
			Amazon.CloseBrowser() ;
		
	}
	
	// Dharmaja Date : Jan 6th starts
	
	 public static void FlipkartOpenBrowser() 
	  {
		 System.out.println("Flipkart OpenBrowser started");
			FlipKart1.FlipkartOpenBrowser() ;
		 
	 }
	 public static void FlipkartLogin() 
	  {
		 System.out.println("FlipkartLogin started");
			FlipKart1.FlipkartLogin() ;
		 
	 }
	
	 public static void FlipkartLogout() 
	  {
		 System.out.println("FlipkartLogout started");
			FlipKart1.FlipkartLogout() ;
		 
	 }
	 public static void FlipkartCloseBrowser() 
	  {
		 System.out.println("FlipkartCloseBrowser started");
			FlipKart1.FlipkartCloseBrowser() ;
		 
	 }
	 
	// Dharmaja Date : Jan 6th ends
	
}