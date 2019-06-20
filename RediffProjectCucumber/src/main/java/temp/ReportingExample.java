package temp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qtpselenium.rediff.reporting.ExtentManager;

public class ReportingExample {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+"\\reports\\";
		ExtentReports rep = ExtentManager.getInstance(path);
		ExtentTest test = rep.createTest("AppTest");
		test.log(Status.INFO, "Application Test started");
		test.log(Status.INFO,"Opening browser Mozilla");
		test.log(Status.FAIL, "Test failed");
		rep.flush();
		
		

	}

}
