package scripts;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
	public static AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;
	public static void SwipeLeft(WebElement element, WebDriver driver) throws InterruptedException {

		WebElement panel = element;
		Dimension size = panel.getSize();
		int Anchor = panel.getSize().getHeight() / 2;
		Double ScreenWidthStart = size.getWidth() * 0.8;
		int ScrollStart = ScreenWidthStart.intValue();

		Double ScreenWidthEnd = size.getWidth() * 0.2;
		int ScrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(ScrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(ScrollEnd, Anchor))
				.release().perform();

	}

	public static void SwipeRight(WebElement element3, WebDriver driver3) throws InterruptedException {

		WebElement panel = element3;
		Dimension size = panel.getSize();
		int Anchor = panel.getSize().getHeight() / 2;
		Double ScreenWidthStart = size.getWidth() * 0.2;
		int ScrollStart = ScreenWidthStart.intValue();

		Double ScreenWidthEnd = size.getWidth() * 0.8;
		int ScrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver3).press(PointOption.point(ScrollStart, Anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(ScrollEnd, Anchor))
				.release().perform();

	}

	public static void ScrollDown(WebElement element1, WebDriver driver1) {
		WebElement panel2 = element1;
		Dimension size = panel2.getSize();

		int ScreenWidthStart = (int) (size.getWidth() * 0.3);
		int ScreenHeightStart = (int) (size.getHeight() * 0.8);
		//int ScrollStart = ScreenWidthStart.intValue();

		int ScreenWidthEnd = (int) (size.getWidth() * 0.2);
		int ScreenHeightEnd = (int) (size.getHeight() * 0.2);
		//int ScrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver1).press(PointOption.point(ScreenWidthStart, ScreenHeightStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(ScreenWidthEnd, ScreenHeightEnd))
				.release().perform();
	}

	public static void ScrollUp(WebElement element2, WebDriver driver2) {
		WebElement panel3 = element2;
		Dimension size = panel3.getSize();
		int ScreenWidthStart = (int) (size.getWidth() * 0.5);
		int ScreenHeightStart = (int) (size.getHeight() * 0.2);
		//int ScrollStart = ScreenWidthStart.intValue();

		int ScreenWidthEnd = (int) (size.getWidth() * 0.5);
		int ScreenHeightEnd = (int) (size.getHeight() * 0.8);
		//int ScrollEnd = ScreenWidthEnd.intValue();

		new TouchAction((PerformsTouchActions) driver2).press(PointOption.point(ScreenWidthStart, ScreenHeightStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(ScreenWidthEnd, ScreenHeightEnd))
				.release().perform();
	}

}
