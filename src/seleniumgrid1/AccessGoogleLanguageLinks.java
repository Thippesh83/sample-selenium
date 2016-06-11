package seleniumgrid1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

		public class AccessGoogleLanguageLinks {
	
			public static void main(String[] args)  {


		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='_eEe']/a[7]")).click();
		List<WebElement> anchorList = driver.findElement(By.id("_eEe")).findElements(By.tagName("a"));
		Iterator<WebElement> it = anchorList.iterator();
		System.out.println(anchorList.size());
		WebElement element=null;
		while(it.hasNext()) {
			element = it.next();
			System.out.println(element.getAttribute("href")+"   "+element.getText());
		}
		
		
	}


}
