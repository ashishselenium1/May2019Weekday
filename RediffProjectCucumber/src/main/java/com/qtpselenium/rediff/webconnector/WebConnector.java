package com.qtpselenium.rediff.webconnector;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import  org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qtpselenium.rediff.reporting.ExtentManager;

public class WebConnector {
	
	public WebDriver driver;
	public Properties prop;
	public ExtentReports rep;
	public ExtentTest test;
	//public String x;
	
	public WebConnector() {
		System.out.println("-------WebConnector init------------");
		//x="Hello";
		// Init the properties
		String path=System.getProperty("user.dir") + "\\src\\test\\resources\\env.properties";
		prop = new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream(path);
			prop.load(fs);
			String env = prop.getProperty("env");
			// init the proper file for that env
			path=System.getProperty("user.dir") + "\\src\\test\\resources\\"+env+".properties";
			fs = new FileInputStream(path);
			prop.load(fs);
			
		} catch (Exception e) {
			// file is not found
			e.printStackTrace();
		}
		
	}
	
	public void openBrowser(String bType) {
		if(prop.getProperty("gridRun").equals("N")) {
			if(bType.equals("mozilla"))
				driver = new FirefoxDriver();
			else if(bType.equals("chrome"))
				driver = new ChromeDriver();
			else if(bType.equals("ie"))
				driver = new InternetExplorerDriver();
		}else {
			// remoteWebDriver
			DesiredCapabilities cap=null;
			if(bType.equals("Mozilla")){
				cap = DesiredCapabilities.firefox();
				cap.setBrowserName("firefox");
				cap.setJavascriptEnabled(true);
				cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
				
			}else if(bType.equals("Chrome")){
				 cap = DesiredCapabilities.chrome();
				 cap.setBrowserName("chrome");
				 cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			}
			
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void navigate(String urlKey) {
		driver.get(prop.getProperty(urlKey));
	}
	
	public void type(String data, String locatorKey) {
		///wait(5);
		log("Typing in "+locatorKey+". Data "+ data);
		getObject(locatorKey).sendKeys(data);
	}
	
	public void click(String locatorKey) {
		log("Clicking on "+locatorKey);
		getObject(locatorKey).click();
	}

	public void select(String objectKey,String data) {
		Select s= new Select(getObject(objectKey));
		s.selectByVisibleText(data);
	}
	
	public void clickAndWait(String xpathExpTarget, String xpathExpWait, int maxTime){
		for(int i=0;i<maxTime;i++){
			// click
			getObject(xpathExpTarget).click();
			// check presence of other ele
			if(verifyElementPresent(xpathExpWait) && driver.findElement(By.id(prop.getProperty(xpathExpWait))).isDisplayed()){
				// if present - success.. return
				return;
			}else{
				// else wait for 1 sec
				wait(1);
			}
			
		}
		// 10 seconds over - for loop - comes here
		reportFailure("Target element coming after clicking on "+xpathExpTarget );
	}
	

	public void clear(String objectKey) {
		getObject(objectKey).clear();
	}
	
	
	public WebElement getObject(String locatorKey) {
		//log("Finding object " + locatorKey);
		WebElement e = null;
		try{
			// check for visibility
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			// extract object
			if(locatorKey.endsWith("_id")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty(locatorKey))));
				e = driver.findElement(By.id(prop.getProperty(locatorKey)));
			}
			else if(locatorKey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty(locatorKey))));
				e = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
			}
			else if(locatorKey.endsWith("_css")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(prop.getProperty(locatorKey))));
				e = driver.findElement(By.cssSelector(prop.getProperty(locatorKey)));
			}
		}catch(Exception ex) {
			// reporting failure
			reportFailure("Unable to extract object "+locatorKey);
		}
		return e;
	}
	
	public  void wait(int time) {
		try {
			Thread.sleep(1000*time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/******************Validations****************************/
	public void isElementPresent(String locatorKey) {
		log("Checking presence of element "+ locatorKey);
		List<WebElement> list=null;
		
		if(locatorKey.endsWith("_id"))
			list = driver.findElements(By.id(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			list = driver.findElements(By.xpath(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_css"))
			list = driver.findElements(By.cssSelector(prop.getProperty(locatorKey)));
		
		if(list.size()==0)
			reportFailure("Element not found "+locatorKey );
		log("Element found !");
	}
	
	public boolean verifyElementPresent(String locatorKey) {
		log("Checking presence of element "+ locatorKey);
		List<WebElement> list=null;
		
		if(locatorKey.endsWith("_id"))
			list = driver.findElements(By.id(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_xpath"))
			list = driver.findElements(By.xpath(prop.getProperty(locatorKey)));
		else if(locatorKey.endsWith("_css"))
			list = driver.findElements(By.cssSelector(prop.getProperty(locatorKey)));
		
		if(list.size()==0)
			return false;
		else
			return true;
		
	}
	
	/******************Reporting**********************/
	public void initReports(String scenarioName) {
		String path = System.getProperty("user.dir")+"\\reports\\";
	    rep = ExtentManager.getInstance(path);
	    test = rep.createTest(scenarioName);
	}
	
	public void log(String msg) {
		test.log(Status.INFO, msg);
	}
	
	public void quit() {
		rep.flush();
		if(driver != null)
			driver.quit();
	}
	
	public void reportFailure(String failureMsg) {
		// report failure in extent reports
		test.log(Status.FAIL, failureMsg);
		// take the screenshot and put in extent reports
		takeSceenShot();
		// fail in cucumber
		Assertions.fail(failureMsg);
	}
	

	public void takeSceenShot(){
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_")+".png";
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+screenshotFile));
			//put screenshot file in reports
			test.log(Status.FAIL,"Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screenshotFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}
	

	public void login(String username, String password) {
		type(username,"username_text_field_id" );
		click("username_submit_button_css");
		type(password,"password_text_field_xpath");
		click("loginSubmit_xpath");
		waitForPageToLoad();
	}

	
	public void waitForPageToLoad(){
	JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		
		while(i!=10){
		String state = (String)js.executeScript("return document.readyState;");
		//System.out.println(state);

		if(state.equals("complete"))
			break;
		else
			wait(2);

		i++;
		}
		// check for jquery status
		i=0;
		while(i!=10){
	
			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue() == 0 )
			 	break;
			else
				 wait(2);
			 i++;
				
			}
		
	}
	
	public void acceptAlertIfPresent() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}catch(Exception e) {
			// not present
		}
	}
	

}
