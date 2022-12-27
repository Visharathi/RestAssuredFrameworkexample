package pageclass;

import org.testng.Assert;

import baseclassPackages.baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestPage extends baseclass {

	public Response getRequestQueryParam()
	{
		
		RestAssured.baseURI = prop.getProperty("url");
		 httpRequest = RestAssured.given();
		 responseBody = httpRequest.request(Method.GET,"/api/users?page="+prop.getProperty("pageno"));
		return responseBody;
		
	}
	public Response getRequestPathParam()
	{
		
		RestAssured.baseURI = prop.getProperty("url")+"/api/unknown/23";
		 httpRequest = RestAssured.given();
		 responseBody = httpRequest.request(Method.GET);
		return responseBody;
		
	}
	
}
