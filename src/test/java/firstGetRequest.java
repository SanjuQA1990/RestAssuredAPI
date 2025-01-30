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
	@Test
	void test2() {
		
		RestAssured.baseURI= "https://reqres.in/api/users";
		RestAssured .given().queryParams("Page","2").when().get().then().statusCode(200);		
	}

}
