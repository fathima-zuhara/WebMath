package Pages_WM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePage_Webmath.BasePage_WM;

public class Math_ForEveryonePage extends BasePage_WM {
 
	public void MathForEveryone_button() {
		
		driver.findElement(By.id("navBox-1")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Everyday_Math() {
		WebElement table=driver.findElement(By.xpath("//*[@id=\"d-childMainContLeft\"]/div[3]/table"));
	    WebElement names=table.findElement(By.xpath("(//font[@size='2']//a[1])[1]"));
	    
	    names.click();
	}
	
	public void Tip_calcutor() {
		driver.findElement(By.name("param0")).clear();
		 driver.findElement(By.name("param0")).sendKeys(prop.getProperty("tip")); 
		 driver.findElement(By.name("param1")).sendKeys(prop.getProperty("cost"));
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public void Math_help() {
		
		Select topic=new Select(driver.findElement(By.xpath("//*[@id=\"topicItem\"]")));
		topic.selectByVisibleText(prop.getProperty("Mp_topic"));
		driver.navigate().back();
	}
	
	public void Sale_price() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[2])[1]")).click();	
		driver.findElement(By.name("param0")).clear();
		 driver.findElement(By.name("param0")).sendKeys(prop.getProperty("Original_cost")); 
		 driver.findElement(By.name("param1")).sendKeys(prop.getProperty("sale"));
		 driver.findElement(By.xpath("//input [@type='submit']")).click();
	}
	
   public void Wind_chill() {
		
		 driver.findElement(By.xpath("(//font[@size='2']//a[3])[1]")).click();	
		 driver.findElement(By.name("param0")).clear();
		 driver.findElement(By.name("param0")).sendKeys(prop.getProperty("outside_temp")); 
		 driver.findElement(By.name("param1")).sendKeys(prop.getProperty("wind_speed"));
		 driver.findElement(By.xpath("//input [@type='submit']")).click();
	}
   
   public void Count_coins() {
		
		 driver.findElement(By.xpath("(//font[@size='2']//a[4])[1]")).click();	
		 driver.findElement(By.name("q")).sendKeys(prop.getProperty("quarters"));
		 driver.findElement(By.name("d")).sendKeys(prop.getProperty("dimes")); 
		 driver.findElement(By.name("n")).sendKeys(prop.getProperty("nickels"));
		 driver.findElement(By.name("p")).sendKeys(prop.getProperty("pennies"));
		 driver.findElement(By.xpath("//input [@type='submit']")).click();
	
	}
   
   public void Lottery_Odds() {
		
		driver.findElement(By.xpath("(//font[@size='2']//a[5])[1]")).click();	
		driver.findElement(By.name("count")).sendKeys(prop.getProperty("count"));
		driver.findElement(By.name("low")).sendKeys(prop.getProperty("lowest_num")); 
	    driver.findElement(By.name("high")).sendKeys(prop.getProperty("highest_num"));
	    driver.findElement(By.xpath("//input [@type='submit']")).click();
	
	}
}
