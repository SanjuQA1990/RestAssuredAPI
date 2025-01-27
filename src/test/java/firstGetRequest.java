import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class firstGetRequest {
	
	// https://reqres.in/api/users/2
	@Test
	void testCase(){
		Response res= RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println(" Status Code= " + res.getStatusCode());
	}

}
