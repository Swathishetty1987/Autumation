package Scripts;

import org.openqa.selenium.By;

import Generic.BaseTest;
import Page.AllJewellery;
import Page.HomePage;
import Page.ProductPage;
import Page.SolitairePage;

public class AddToCart extends BaseTest {
//commit
	public void testlogin() throws Exception
	{
		HomePage h=new HomePage(driver);
		h.ClickLoginin();
		h.setemailid("swathi.js@gmail.com");
		h.setpassword("hellosishellosis");
		h.ClickLoginhere();
			h.clicksolitaire();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='pid_8506'])[1]")).click();
		ProductPage p=new ProductPage(driver);
		p.clickbuynow();
		}
}
