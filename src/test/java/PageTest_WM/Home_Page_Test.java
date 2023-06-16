package PageTest_WM;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage_Webmath.BasePage_WM;
import Pages_WM.Algebra_Page;
import Pages_WM.GeneralMath_Page;
import Pages_WM.Home_Page;
import Pages_WM.K8Math_Page;
import Pages_WM.Math_ForEveryonePage;
import Pages_WM.OtherStuff_Page;
import Pages_WM.PlotsandGeometry_Page;
import Pages_WM.Trigandcalculas_Page;

public class Home_Page_Test extends BasePage_WM{

	
	Home_Page Hp;
	
	
	K8Math_Page Kp;
	Algebra_Page Ap;
	PlotsandGeometry_Page Pp;
	Trigandcalculas_Page Tp;
	OtherStuff_Page Op;
	
	@BeforeMethod
     public void Browser_config() {
		
		      Initialization();
              
              Hp=new Home_Page();
              Kp=new K8Math_Page();
              Ap=new Algebra_Page();
              Pp=new PlotsandGeometry_Page();
              Tp=new Trigandcalculas_Page();
              Op= new OtherStuff_Page();
              
            }
	
     @Test
	 public void Validate_Home_page() {
    	
		Hp.Home_button();
     }
     
     
     @Test
     public void ValidatePage_Title() {
    	String actTitle=Hp.Page_Title();
    	String expTitle=prop.getProperty("title");
 		Assert.assertEquals(actTitle, expTitle);
	}
		//Hp.Page_Title();
     @Test
     public void ValidatePage_Logo() {
		boolean logo=Hp.Page_Logo();
	    Assert.assertTrue(logo);
	   
     }
     @Test
     public void ValidateMath_Help() {
    	 Hp.Math_Help();
	}
     
     @Test
     public void Validate_Image() {
	    Hp.Image_1();
	    Hp.Image_2();
	    Hp.Image_3();
	}

//     @Test(priority = 1)
//     public void Validate_Math_ForEveryonePage() {
//		Mp.MathForEveryone_button();
//	}
    
     
     
     
     @Test(priority = 4)
     public void ValidateAlgebra_page(){
    	 Ap.Algebra_button();
     }
     
    @Test(priority = 5)
     public void ValidatePlotsandGeometry_page(){
    	 Pp.PlotsandGeometry_button();
     }
     
     @Test(priority = 6)
     public void ValidateTrigandcalculas_page(){
    	 Tp.Trigandcalculas_button();
     }
     
     @Test(priority = 7)
     public void ValidateOtherStuff_Page(){
    	 Op.OtherStuff_button();
     }
     
     @AfterMethod
 	 public void Validate_BrowserClosing() {
 		TearDown();
 	}
     
     
     
     
     
     
     
}