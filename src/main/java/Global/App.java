package Global;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	/*g.openqa.selenium.remote.DesiredCapabilities dc=new DesiredCapabilities();
    	dc.setBrowserName("Chrome");
    	dc.setPlatform(Platform.WINDOWS);
    	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"),dc);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	driver.get("https://google.com");*/
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver1=new org.openqa.selenium.chrome.ChromeDriver();
		driver1.get("https://google.com");
		driver1.manage().window().maximize();
			
		driver1.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.SHIFT, "Testing");

		Actions Ac=new Actions(driver1);
		Ac.moveToElement(driver1.findElement(By.className("gb_g"))).build().perform();
		Set<String> dc=driver1.getWindowHandles();
		Iterator<String> it=dc.iterator();
		it.next();
		it.next();
		String third=it.next();
		driver1.switchTo().window(third);
		driver1.get("URL");
		//Takes screenshot
		File sc=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, new File("c://file.png"));
		

		
    }
}
