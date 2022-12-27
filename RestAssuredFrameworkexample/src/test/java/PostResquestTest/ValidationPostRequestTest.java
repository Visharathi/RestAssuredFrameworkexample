package PostResquestTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackages.baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import pageclass.GetRequestPage;
import pageclass.PostRequestPage;

public class ValidationPostRequestTest extends baseclass {
	PostRequestPage p;
	@BeforeMethod
	public void setUp() {
		logger.info("**********Starting Post Request Test cases**********");
		initialization();
		p = new PostRequestPage();
			
	}
	@Test
	public void PostRequestTest()
	{
		logger.info("**********Executing First Test Case**********");
		Response responseBodyTest = p.PostRequest();
		String responseText = responseBodyTest.getBody().asString();
		//assertions
		int statusCode = responseBodyTest.getStatusCode();
		String jobnode = responseBodyTest.jsonPath().get("job");
		
		Assert.assertEquals(statusCode, 201);
		Assert.assertEquals(jobnode, "tester");
		Assert.assertEquals(responseBodyTest.jsonPath().get("name"), "visha");
		Assert.assertTrue(responseText.contains("id"));
		
	}
	@AfterMethod
	public void  EndTestCase()
	{
		logger.info("**********End of all PostRequest Test Cases**********");
	}
}
