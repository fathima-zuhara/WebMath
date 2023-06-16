package PageTest_WM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.Home_Page;
import Pages_WM.Math_ForEveryonePage;

public class MathForEveryone_pageTest extends BasePage_WM{
	
	Math_ForEveryonePage Mp;
	
	@BeforeMethod
	public void Browser_Configs() {
		Initialization();
		Mp=new Math_ForEveryonePage();
	}
	
	@Test
	public void ValidateMathForEveryone_Page() {
		Mp.MathForEveryone_button();
	}
	
	@Test
	public void ValidateEveryday_Math() {
		Mp.MathForEveryone_button();
		Mp.Everyday_Math();
	}
	
	@Test
	public void ValidateMath_help() {
		ValidateMathForEveryone_Page();
		Mp.Math_help();
	}
		
		@Test
	public void ValidateTip_calcutor() {
        ValidateEveryday_Math();
		Mp.Tip_calcutor();
	}
	@Test	
	public void ValidateSale_price() {
		ValidateMathForEveryone_Page();
		Mp.Sale_price();
	}
	
	@Test
	public void ValidateWind_chill() {
		ValidateMathForEveryone_Page();
		Mp.Wind_chill();
	}
	
	@Test
	public void Count_coins() {
		ValidateMathForEveryone_Page();
		Mp.Count_coins();
	}

	@Test
	public void Lottery_Odds() {
		ValidateMathForEveryone_Page();
		Mp.Lottery_Odds();
	}
    @AfterMethod
	 public void Validate_BrowserClosing() {
		TearDown();
	}
}   

