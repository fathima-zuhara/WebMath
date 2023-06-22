package PageTest_WM;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.K8Math_Page;

public class K8MathPage_Test extends basepageWebMath{

	K8Math_Page Kp;
	
	@BeforeMethod
    public void Browser_config() {
		
	  Initialization();
      Kp=new K8Math_Page();
      } 
      
	@Test
    public void ValidateK8Math_page() {
		Kp.K8Math_button();
	}
	@Test
	public void ValidateMultiply() {
		ValidateK8Math_page() ;
		Kp.Multiply();
	}
	@Test
	public void ValidateDivide() {
	    ValidateK8Math_page() ;
		Kp.Divide();
	}
	@Test
	 public void Place_value() {
		ValidateK8Math_page() ;
		Kp.Place_value();
	}	
	@Test
	  public void Number_Line() {
		  ValidateK8Math_page() ;
		  Kp.Number_Line();
		}	
	@Test
	  public void NumberRounding_tens() {
		 ValidateK8Math_page() ;
		  Kp.NumberRounding_tens();
		}		
	@Test
	  public void NumberRounding_thousands() {
		 ValidateK8Math_page() ;
		  Kp.NumberRounding_thousands();
		}		
	@Test
	  public void Compare_NumberLine() {
		 ValidateK8Math_page() ;
		  Kp.Compare_NumberLine();
		}		
	
	 @AfterMethod
 	 public void Validate_BrowserClosing() {
 		TearDown();
 	}
		
		
	
	
}
