package pageActions;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import pageLocators.homepagelocator;
import utility.irineutility;
import utility.testbase;

public class homepageAction extends testbase {
	
	
	homepagelocator Product = new homepagelocator();//to accese locator class we creat objectName Product in Acction class 

	public void userCredantial(String u,String p) throws Exception {
		Product.UserName.sendKeys(u);
		Product.password.sendKeys(p);
		Product.loginbutton.click();
		
		Thread.sleep(7000);
		
		
		
		}
			public void Clicklogin() {
				Product.loginlink.click();
				
			}
			public void ClickonNokialumia1520 () throws Exception {
				Product.Nokialumia1520.click();
				Thread.sleep(3000);
			}
			public void clickonaddtocartbutton() throws Exception {
				Product.clickonaddtocartbutton.click();
				
				Thread.sleep(3000);
				driver.switchTo().alert().accept(); //pop up Handel code
				
			}
			public void clickoncartbutton() throws Exception {
				Product.clickoncart.click();
				Thread.sleep(3000);
			}
			public void Productdisplayedoncartpage() {
				boolean result= Product.productdisplayedoncartpage.isDisplayed();//
			Assert.assertTrue(result);// Assert to verify our test
			irineutility.fbScreenshots(driver, "displyed");//code for screenshot
			
			
			}
			public void ClickonGalaxyS6() {    //test #2
			 Product.ClickonGalaxyS6.click();
			 
			}
			public void productdisplayed() {
				boolean result = Product.productdisplayedoncartpage.isDisplayed();
				Assert.assertTrue(result);
				
			}
			public void NexUSS6() {  //test #3
			Product.NeuxUS6.click();	
			}
			public void addcart() throws Exception {
				Product.clickoncartbutton.click();
				Thread.sleep(4000);
			}
			public void clickoncart() throws Exception {   
			Product.clickoncart.click();
			Thread.sleep(4000);
				
			}
			
			public void title () {
			boolean result = Product.title.isDisplayed();
			Assert.assertTrue(result);
			}
				
			
				public void Sonyvaioi5() throws Exception  {    //#4
					Product.Sonyvaioi5.click();
					Thread.sleep(4000);
				}
				public void price() {
					boolean result = Product.pricedisplayedoncartpage.isDisplayed();
					Assert.assertTrue(result);
				}
				public void oorderbutton() {           //#5
				boolean result=	Product.oorderbutton.isDisplayed();
				Assert.assertTrue(result);
				
				
				}
				
				}
			

			

	
