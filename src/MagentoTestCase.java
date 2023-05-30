import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MagentoTestCase extends Parameter {
	@BeforeTest
	public void mybefortest() {
		driver.get(NameTheWebsite); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		RadinetPrice = driver.findElement(By.xpath("//*[@id=\"old-price-1556-widget-product-grid\"]")).getText();
		breathePrice = driver.findElement(By.xpath("//*[@id=\"old-price-1812-widget-product-grid\"]")).getText();

		argusPrice = driver.findElement(By.xpath("//*[@id=\"old-price-694-widget-product-grid\"]")).getText();

		heroPrice = driver.findElement(By.xpath("//*[@id=\"old-price-158-widget-product-grid\"]")).getText();

		backpackPrice = driver.findElement(By.xpath("//*[@id=\"old-price-6-widget-product-grid\"]")).getText();
	}
	
	@Test(priority=1)
	public void SignUpTest() throws InterruptedException {
		WebElement SignUpClick=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a"));
		SignUpClick.click();
		
		WebElement firstName=driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		firstName.sendKeys(FirstName[RandomIndex]);
		
		WebElement LastName=driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		LastName.sendKeys(this.LastName[RandomIndex]);

		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		Email.sendKeys(this.Email+IndexForEmail+PartEmail);
	    EmailForLogin = this.Email+IndexForEmail+PartEmail;
		WebElement Pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pass.sendKeys(this.Pass);
        WebElement ConfirmPass=driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
        ConfirmPass.sendKeys(this.Pass);

		WebElement creatAccount=driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
		creatAccount.click();
		
		Thread.sleep(3000);
		
		 String signOut="https://magento.softwaretestingboard.com/customer/account/logout/";
		driver.get(signOut);
	}
	
   	@Test(priority=2)
	 public void SignInTest() {
		WebElement SignInClick=driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a"));
		SignInClick.click();
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Email.sendKeys(EmailForLogin);
		
		WebElement Pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		Pass.sendKeys(this.Pass);
		WebElement SingInButton = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
				SingInButton.click();
	}
	
	@Test(priority = 3)
	public void AddItems() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] ItemPages = { "https://magento.softwaretestingboard.com/radiant-tee.html",
				"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
				"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
				"https://magento.softwaretestingboard.com/hero-hoodie.html",
				"https://magento.softwaretestingboard.com/fusion-backpack.html" };

		for (String ITEM : ItemPages) {
			driver.get(ITEM);

			Thread.sleep(5000);

			if (driver.getCurrentUrl().contains("radiant")) {
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(radiantNumber);

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();
				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("breathe")) {
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(breatheNumber);

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();

				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("argus")) {

				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(argusNumber);

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();

				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("hoodie")) {

				WebElement ColorBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
				List<WebElement> colors = ColorBox.findElements(By.tagName("div"));
				int randomIndexForTheColor = rand.nextInt(0, colors.size());
				colors.get(randomIndexForTheColor).click();

				WebElement SizesBox = driver
						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
				List<WebElement> sizes = SizesBox.findElements(By.tagName("div"));

				int randomindex = rand.nextInt(0, sizes.size());
				sizes.get(randomindex).click();
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));

				Quantity.sendKeys(heroNumber);

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(1000);

			} else if (driver.getCurrentUrl().contains("backpack")) {
				WebElement Quantity = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
				Quantity.clear();

				Quantity.sendKeys(backpackNumber);

				WebElement AddtoCart = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
				AddtoCart.click();
				Thread.sleep(3000);
			}

		}

	}

	@Test(priority = 4)
	public void CheckOutProcess() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(CheckoutPage);

		WebElement StreetAdress = driver.findElement(By.name("street[0]"));

		StreetAdress.sendKeys("Amman");

		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("Amman");

		WebElement region = driver.findElement(By.name("region_id"));
		Select selector = new Select(region);

		selector.selectByIndex(RandomIndex);

		WebElement PostalCode = driver.findElement(By.name("postcode"));

		PostalCode.sendKeys("123");

		WebElement country = driver.findElement(By.name("country_id"));
		
		Select selector2= new Select(country);

		selector2.selectByIndex(RandomIndex);

		WebElement mobileNumber = driver.findElement(By.name("telephone"));

		mobileNumber.sendKeys("9627997770");
		Thread.sleep(10000);
		WebElement SubmitButton = driver
				.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
		SubmitButton.click();
	}

	@Test()
	public void this_is_a_test() {

		List<String> PriceList = new ArrayList<String>();

		PriceList.add(RadinetPrice);
		PriceList.add(breathePrice);
		PriceList.add(argusPrice);
		PriceList.add(heroPrice);
		PriceList.add(backpackPrice);


		for (int i = 0; i < PriceList.size(); i++) {

			String ListPriceUpdated = PriceList.get(i);

			String output = ListPriceUpdated.replaceAll("\\$|\\.\\d+", "");

			int finalPrice = Integer.parseInt(output);
			
			System.out.println(finalPrice);

		}
		
		
		List<String> ItemNumber = new ArrayList<String>();

		ItemNumber.add(radiantNumber);
		ItemNumber.add(breatheNumber);
		ItemNumber.add(argusNumber);
		ItemNumber.add(heroNumber);
		ItemNumber.add(backpackNumber);

		
		
		for (int i = 0; i < ItemNumber.size(); i++) {

			String ItemNumberUpdated = ItemNumber.get(i);

			int finalPrice = Integer.parseInt(ItemNumberUpdated);
			
			System.out.println(finalPrice);

		}
   	
	
}}
