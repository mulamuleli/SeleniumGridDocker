package dockerContainers;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerRunningOnFirefox_1
{
	@Test
	public void test_1() throws MalformedURLException
	{
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		URL container_url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver =new RemoteWebDriver(container_url, dc );
		driver.manage().window().setPosition(new Point(-2000, 0));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("The tile of this page is"+driver.getTitle());
//		driver.quit();
	}
	 

}
