package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridExam {

	WebDriver driver;
	String baseUrl, nodeUrl;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		baseUrl = "http://rediffmail.com";
		nodeUrl = "http://192.168.0.2:5566/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeUrl), capability);
	}
	
	@AfterTest
	public void aftetest(){
		driver.close();
	}
	
	@Test
	public void simpleTest(){
		driver.get(baseUrl);
	}
}
