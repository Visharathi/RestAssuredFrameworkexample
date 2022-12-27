package pageclass;

import org.json.simple.JSONObject;

import baseclassPackages.baseclass;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class PostRequestPage extends baseclass {
	
	public Response PostRequest()
	{
		
		RestAssured.baseURI = prop.getProperty("url")+"/api/users";
		 httpRequest = RestAssured.given();
		 object = new JSONObject();
			object.put("name", prop.getProperty("user1"));
			object.put("job", prop.getProperty("job"));
			httpRequest.body(object.toJSONString());
			//set header 
			httpRequest.header("Content-Type", Headername);
			//hit the request
			Response responseBody = httpRequest.request(Method.POST);
			return responseBody;
		
	}
}
