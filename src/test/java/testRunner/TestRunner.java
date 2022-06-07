package testRunner;

import org.Reports.JsonReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = { "src\\test\\resources\\Pepul.feature" }, glue = {
			"scripts" }, monochrome = true, dryRun = false, plugin = { "pretty",
					"json:C:\\Users\\ADMIN\\eclipse-workspace\\PepulTest\\Reports\\result.json" })
	public static class TestRunner1 {
		@AfterClass
		public static void afterClass() {
			JsonReports.jvmReports("C:\\Users\\ADMIN\\eclipse-workspace\\PepulTest\\Reports\\result.json");

		}
}
}
