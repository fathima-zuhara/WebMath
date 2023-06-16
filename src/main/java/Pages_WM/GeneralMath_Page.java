package Pages_WM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import BasePage_Webmath.BasePage_WM;

public class GeneralMath_Page extends BasePage_WM{
     
	public void GeneralMath_button() {
		driver.findElement(By.id("navBox-2")).click();
	}
	public void Math_help() {
		
		Select topic=new Select(driver.findElement(By.id("topicItem")));
		topic.selectByVisibleText(prop.getProperty("GM_topic"));
		driver.navigate().back();
	}
	public void Factor() {
		driver.findElement(By.xpath("(//font[@size='2']//a[1])[1]")).click();
		Select show_meAll=new Select(driver.findElement(By.name("param0")));
		show_meAll.selectByVisibleText(prop.getProperty("Select_All"));
		driver.findElement(By.name("param1")).sendKeys(prop.getProperty("Factor_numAll"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();
		
		Select show_mePrime=new Select(driver.findElement(By.name("param0")));
		show_mePrime.selectByVisibleText(prop.getProperty("Select_Prime"));
		driver.findElement(By.name("param1")).clear();
		driver.findElement(By.name("param1")).sendKeys(prop.getProperty("Factor_numPrime"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	 public void GCF() {
			
		 driver.findElement(By.xpath("(//font[@size='2']//a[2])[1]")).click();	
		 driver.findElement(By.name("param0")).clear();
		 driver.findElement(By.name("param0")).sendKeys(prop.getProperty("GCF")); 
		 driver.findElement(By.xpath("//input [@type='submit']")).click();

    }
	 public void LCM() {
			
		 driver.findElement(By.xpath("(//font[@size='2']//a[3])[1]")).click();	
		 driver.findElement(By.name("param0")).clear();
		 driver.findElement(By.name("param0")).sendKeys(prop.getProperty("LCM")); 
		 driver.findElement(By.xpath("//input [@type='submit']")).click();

    }
	 public void Pronouncing() {
			
		 driver.findElement(By.xpath("(//font[@size='2']//a[4])[1]")).click();	
		 driver.findElement(By.name("number")).clear();
		 driver.findElement(By.name("number")).sendKeys(prop.getProperty("Pronounce")); 
		 driver.findElement(By.xpath("//input [@type='submit']")).click();

    }
}