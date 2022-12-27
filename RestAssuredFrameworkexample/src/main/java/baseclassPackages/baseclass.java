package baseclassPackages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class baseclass {
	 public RequestSpecification httpRequest;
	 public	Response responseBody;
	 public	JSONObject object;
	 public static Properties prop;
	 public String Headername = "application/json";
	
	 public static Logger logger = Logger.getLogger("RestAssuredFrameworkexample");
	public static void initialization() {
		
		PropertyConfigurator.configure("C:\\Users\\PrakashV\\eclipse-workspace\\RestAssuredFrameworkexample\\src\\main\\resources\\log4j.properties");
		logger.setLevel(Level.DEBUG);
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\PrakashV\\eclipse-workspace\\RestAssuredFrameworkexample\\src\\main\\java\\data\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
					}}	
		
	
}
