import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parameter {
	static WebDriver driver= new ChromeDriver();
	String NameTheWebsite="https://magento.softwaretestingboard.com/";
	Assertion myassert=new Assertion();

	Random rand=new Random();
	String [] FirstName= {"Maremar","Amal","Ekhlas","Marah"};
	String [] LastName= {"Ahamad","Mahmoud","Mohammad","Abdo"};
	String CheckoutPage = "https://magento.softwaretestingboard.com/checkout/";

	int RandomIndex=rand.nextInt(0,5);
	
	String Pass="mareMare81!$";
    String Email="marysamara2001";
    String PartEmail="@gmail.com";
    String EmailForLogin;
	int IndexForEmail=rand.nextInt(0,100);
	
	// this is the number of item
	int radiantNumber = 3;
	String radiantNumberString = "3";
	int breatheNumber = 2;
	String breatheNumberString = "2";

	int argusNumber = 4;
	String argusNumberString = "4";

	int heroNumber = 1;
	String heroNumberString = "1";

	int backpackNumber = 5;
	String backpackNumberString = "5";

		int numberOfItemTobeAdded = 5;

		// this the price
		String RadinetPrice;
		String breathePrice;

		String argusPrice;
		String heroPrice;
		String backpackPrice;

}
