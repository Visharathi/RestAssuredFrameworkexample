package GetRequestTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclassPackages.baseclass;
import io.restassured.response.Response;
import pageclass.GetRequestPage;


public class ValidateGetRequestTest extends baseclass {
	GetRequestPage g;
	@BeforeMethod
	public void setUp() {
		logger.info("**********Starting Get Request Test cases**********");
		initialization();
		g = new GetRequestPage();
			
	}
	@Test
	public void getRequestQueryParamTest()
	{
		logger.info("**********Executing First Test Case**********");
		Response responseBodyTest = g.getRequestQueryParam();
		//validate header value
				String content_type = responseBodyTest.header("Content-Type");
				String xpower = responseBodyTest.header("X-Powered-By");
				//validate status code
				int statusCode = responseBodyTest.getStatusCode();
				String response = responseBodyTest.getBody().asString();
				logger.info("**********checking all the assertions**********");
				Assert.assertEquals(statusCode, 200);
				Assert.assertEquals(content_type, "application/json; charset=utf-8");
				Assert.assertEquals(xpower, "Express");
	}
	@Test
	public void getRequestPathParamTest()
	{
		logger.info("**********Executing second Test Case**********");
		Response responseBodyTest = g.getRequestPathParam();
		logger.info("**********checking the below assertions**********");
	//	Assert.assertEquals(responseBodyTest.jsonPath().get("name"), prop.getProperty("name"));
	}
	
	@AfterMethod
	public void  EndTestCase()
	{
		logger.info("**********End of all GetRequest Test Cases**********");
	}
	}



