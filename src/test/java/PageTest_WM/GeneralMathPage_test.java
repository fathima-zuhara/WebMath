package PageTest_WM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.GeneralMath_Page;
import Pages_WM.Home_Page;

public class GeneralMathPage_test extends basepageWebMath{

	
		GeneralMath_Page Gp;
		
	
		@BeforeMethod
		public void browser_config() {
			
	      Initialization();	
		  Gp=new GeneralMath_Page();
	    
	  }
		  @Test
	     public void ValidateGeneralMath_Page() {
	      
	    	 Gp .GeneralMath_button();
	  }
	     @Test
	     public void ValidateMath_help() {
	    	 ValidateGeneralMath_Page();
	    	 Gp.Math_help();
	  }
	     @Test
	     public void ValidateFactor() {
	    	 ValidateGeneralMath_Page();
	    	 Gp.Factor();
	  }
	     @Test
	     public void ValidateGCF() {
	    	 ValidateGeneralMath_Page();
	    	 Gp.GCF();
	    	
	     }
	     @Test
	     public void ValidateLCM() {
	    	 ValidateGeneralMath_Page();
	    	 Gp.LCM();
	    	
	     }
	     @Test
	     public void ValidatePronouncing() {
	    	 ValidateGeneralMath_Page();
	    	 Gp.Pronouncing();
	    	 
	     }
	     @AfterMethod
	 	 public void Validate_BrowserClosing() {
	 		TearDown();
	 	}
}
