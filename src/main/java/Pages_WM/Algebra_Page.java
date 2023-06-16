package Pages_WM;

import org.openqa.selenium.By;

import BasePage_Webmath.BasePage_WM;

public class Algebra_Page extends BasePage_WM{

	public void Algebra_button() {
		driver.findElement(By.id("navBox-4")).click();
	}
}
