package dockerContainers;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerRunningOnFirefox_2
{
	@Test
	public void Test_2() throws MalformedURLException
	{
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL container_url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver= new RemoteWebDriver(container_url,dc);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
