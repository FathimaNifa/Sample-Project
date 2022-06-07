package scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StepDefinition extends BaseClass
{
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	@Given("user Should Open the App")
	public void user_Should_Open_the_App() throws MalformedURLException {
		cap = new DesiredCapabilities();
		cap.setCapability("no",true);
		cap.setCapability("newCommandTimeout", 100000);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "LZL7QK8PBU7DEEM7");
		cap.setCapability(MobileCapabilityType.UDID, "LZL7QK8PBU7DEEM7");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Apk\\Pepul_Development.apk");
		cap.setCapability(MobileCapabilityType.NO_RESET,"true");
	 	cap.setCapability(MobileCapabilityType.FULL_RESET,"false"); 
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    System.out.println("Pepul Application Successfully Installed");
	}

	@When("user should enter the {string} and GetOtp")
	public void user_should_enter_the_and_GetOtp(String string) throws InterruptedException {
		WebElement mobilenumber = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		mobilenumber.sendKeys(string);
		Thread.sleep(3000);
		WebElement GetOTP = driver.findElement(By.xpath("//*[@text='Get OTP']"));
		GetOTP.click(); 
		Thread.sleep(5000);
		WebElement Allow = driver.findElement(By.xpath("//*[@text='Allow']"));
		Allow.click();
		Thread.sleep(5000);
		
	}

	@When("user should select the Profile picture and Click on okay Button")
	public void user_should_select_the_Profile_picture_and_Click_on_okay_Button() throws InterruptedException {
		WebElement Addpic = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
		Addpic.click();
		Thread.sleep(5000);
		WebElement Align= driver.findElement(By.xpath("//*[@text='2015-09-08 18.02.08.jpg']"));
		Align.click();
		Thread.sleep(3000);
		WebElement Croppic= driver.findElement(By.xpath("//*[@text='CROP']"));
	    Croppic.click();
	    Thread.sleep(2000);
	    WebElement NxtBtn= driver.findElement(By.xpath("//*[@class='android.view.View']"));
	    NxtBtn.click();
	    Thread.sleep(9000);
	}

	@When("user should tap on Profile Pic and Enter the {string} and {string}")
	public void user_should_tap_on_Profile_Pic_and_Enter_the_and(String string, String string2) throws InterruptedException {
		WebElement Menu= driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
    	Menu.click();   
    	Thread.sleep(3000);
    	WebElement Profile= driver.findElement(By.xpath("//*[@class='android.view.View']"));
    	Profile.click();
    	Thread.sleep(3000);
    	WebElement Follower = driver.findElement(By.xpath("//*[@text='Followers']"));
    	Follower.click();
    	Thread.sleep(3000);
    	WebElement Following = driver.findElement(By.xpath("//*[@text='Following']"));
    	Following.click(); 
    	Thread.sleep(3000);
    	WebElement EditProfile = driver.findElement(By.xpath("//*[@text='Edit Profile']"));
    	EditProfile.click();
    	Thread.sleep(3000);
    	
    	WebElement FirstName = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
    	FirstName.sendKeys(string);
    	Thread.sleep(3000);
        WebElement panel = driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']"));
    	ScrollDown(panel , driver);
    	WebElement LastName = driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
    	LastName.sendKeys(string2);
    	Thread.sleep(3000);
    	WebElement SaveBtn = driver.findElement(By.xpath("//*[@class='android.widget.Button']"));
    	SaveBtn.click();
    	Thread.sleep(3000);	 
    	WebElement DoneBtn1 = driver.findElement(By.xpath("//*[@text='DONE']"));
    	DoneBtn1.click();
    	Thread.sleep(1000);
    	WebElement PepulIcon = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[3]"));
    	PepulIcon.click();
    	Thread.sleep(1000);
    	
    		
    	
	}
//
//	@When("User View a Post")
//	public void user_View_a_Post()  throws Exception {
//		WebElement SelectPost = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
//    	SelectPost.click();
//    	Thread.sleep(1000);
//    	WebElement Ellipsis = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
//    	Ellipsis.click();
//    	Thread.sleep(1000);
//    	WebElement SelectViewProfile = driver.findElement(By.xpath("//*[@text='View Profile']"));
//    	SelectViewProfile.click();
//    	Thread.sleep(1000);
//    	WebElement BackIcon = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
//    	BackIcon.click();
//    	Thread.sleep(1000);
//    	WebElement VolumeIcon = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[4]"));
//    	VolumeIcon.click();
//    	Thread.sleep(1000);
//    	WebElement Back = driver.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[0]"));
//    	Back.click();
//    	Thread.sleep(1000);
//    	WebElement Menu= driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
//    	Menu.click();   
//    	Thread.sleep(3000);
//	}

	@When("User Logout")
	public void user_Logout() throws InterruptedException {
		
    	WebElement MenuSelect = driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout']"));
    	MenuSelect.click();
    	Thread.sleep(1000);
    	ScrollUp(MenuSelect , driver);
    	WebElement Setting = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
    	Setting.click();
    	Thread.sleep(1000);
    	WebElement Logout = driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']"));
    	Logout.click();
    	Thread.sleep(1000);
    	WebElement Yes = driver.findElement(By.xpath("//*[@text='Yes']"));
    	Yes.click();
    	Thread.sleep(1000);
    	  
	}

	@Then("User Should Close the App")
	public void user_Should_Close_the_App() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
}
