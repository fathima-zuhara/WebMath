package Pages_WM;

import org.openqa.selenium.By;

import BasePage_Webmath.BasePage_WM;

public class OtherStuff_Page extends BasePage_WM{

	public void OtherStuff_button() {
		driver.findElement(By.id("navBox-7")).click();
	}
	
}
