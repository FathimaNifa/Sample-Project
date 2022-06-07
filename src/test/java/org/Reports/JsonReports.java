package org.Reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JsonReports {
public static void jvmReports(String json) {
		
		File file= new File("C:\\Users\\ADMIN\\eclipse-workspace\\PepulTest\\Reports");
		Configuration config= new Configuration(file,"AppiumLaunch1" );
		config.addClassifications("App","Pepul" );
		config.addClassifications("version", "V 1.23");
		config.addClassifications("Platform","Android 10" );
		config.addClassifications("Reported By","Fathima M K" );
		List<String>li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder= new ReportBuilder(li, config);
		builder.generateReports();
		
		
	
	
	}
}
