package Pages_WM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage_Webmath.BasePage_WM;

public class K8Math_Page extends BasePage_WM{

	public void K8Math_button() {
		driver.findElement(By.id("navBox-3")).click();
	}
	
	public void Multiply() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[3])[1]")).click();
		driver.findElement(By.name("n1")).sendKeys(prop.getProperty("Num1"));
		driver.findElement(By.name("n2")).sendKeys(prop.getProperty("Num2"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,700)", "");
	}
    public void Divide() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[4])[1]")).click();
		driver.findElement(By.name("divisor")).sendKeys(prop.getProperty("Divisor"));
		driver.findElement(By.name("dividend")).sendKeys(prop.getProperty("Divident"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}
    public void Place_value() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[5])[1]")).click();
		driver.findElement(By.name("number")).sendKeys(prop.getProperty("place_valueNum"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("centerContentFrame");
		 WebElement table=driver.findElement(By.xpath("/html/body/font/blockquote/center/table"));
		 WebElement names=table.findElement(By.xpath("(//td//a)[3]"));
		 names.click();
		
		
	}
   public void Number_Line() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[7])[1]")).click();
		driver.findElement(By.name("n")).sendKeys(prop.getProperty("NumberLine"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
   public void NumberRounding_tens() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[6])[1]")).click();
		driver.findElement(By.name("number")).sendKeys(prop.getProperty("NumberRounding_tens"));
		Select topic=new Select(driver.findElement(By.name("roundto")));
		topic.selectByVisibleText(prop.getProperty("Roundto_tens"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
   public void NumberRounding_thousands() {
	    driver.findElement(By.xpath("(//font[@size='2']//a[6])[1]")).click();
 		driver.findElement(By.name("number")).clear();
 		driver.findElement(By.name("number")).sendKeys(prop.getProperty("NumberRounding_thousands"));
 		Select topic=new Select(driver.findElement(By.name("roundto")));
 		topic.selectByVisibleText(prop.getProperty("Roundto_thousands"));
 		driver.findElement(By.xpath("//input[@type='submit']")).click();
 		
 		
 		
 	}
   public void Compare_NumberLine() {
	    driver.findElement(By.xpath("(//font[@size='2']//a[8])[1]")).click();
		driver.findElement(By.name("n1")).sendKeys(prop.getProperty("Comp-Num1"));
		driver.findElement(By.name("n2")).sendKeys(prop.getProperty("Comp-Num2"));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}
}
