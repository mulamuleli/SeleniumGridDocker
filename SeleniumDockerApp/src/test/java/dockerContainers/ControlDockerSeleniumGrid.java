package dockerContainers;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ControlDockerSeleniumGrid 
{
	@BeforeTest
	public void startDockerGrid() throws IOException, InterruptedException 
	{
		Runtime.getRuntime().exec("cmd /c start startSeleniumDockerGrid.bat");
		Thread.sleep(100000);
	}
   @AfterTest
	public void  stopDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start stopSeleniumDockerGrid.bat");
		Thread.sleep(1000000);
//		close command promt
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
    }
}
