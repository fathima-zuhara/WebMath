package Pages_WM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import BasePage_Webmath.BasePage_WM;

public class Home_Page extends BasePage_WM{
    
	public void Home_button() {
	
	driver.findElement(By.id("navBox-0")).click();	
		
    }
	
	public String Page_Title() {
		 return driver.getTitle();
	}
	public boolean Page_Logo() {
		
		return driver.findElement(By.xpath("//img[@alt='WebMath - Solve your math problem today']")).isDisplayed();
    
	} 
	
	public void Math_Help() {
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			 }
		
		Select topic=new Select(driver.findElement(By.id("topicItem")));
		topic.selectByVisibleText(prop.getProperty("topic"));
		driver.navigate().back();
	 }
	
	public void Image_1() {
		
	    driver.switchTo().frame("bsaIframe");
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement image1=driver.findElement(By.xpath("//*[@id=\"bsa-block-728--90\"]/div/div/div/div/div/a/div"));
		js.executeScript("arguments[0].click();",image1);	

	       
	         driver.switchTo().defaultContent();
		
	}
	
	
	public void Image_2() {
	    driver.switchTo().frame("bsaIframeMedRec");
	    driver.findElement(By.xpath("//*[@id=\"bsa-block-300--250\"]/div/div/div/div/div/a/div")).click();
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//	    WebElement image2=driver.findElement(By.xpath("//*[@id=\"bsa-block-300--250\"]/div/div/div/div/div/a/div"));
//		js.executeScript("arguments[0].click();",image2);
		driver.switchTo().defaultContent();
	}
	
	public void Image_3() {
	    driver.switchTo().frame("bsaIframeSKY");
	    driver.findElement(By.xpath("//*[@id=\"bsa-block-160--600\"]/div/div/div/div/div/a/div")).click();
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//	    WebElement image2=driver.findElement(By.xpath("//*[@id=\"bsa-block-300--250\"]/div/div/div/div/div/a/div"));
//		js.executeScript("arguments[0].click();",image2);
		driver.switchTo().defaultContent();
	}
	
}
