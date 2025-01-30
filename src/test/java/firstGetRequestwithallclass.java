import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class firstGetRequestwithallclass {
	
	// https://reqres.in/api/users/2
	@Test
	void testCase(){
		Response res= get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println(" Status Code= " + res.getStatusCode());
	}
	@Test
	void test2() {
		
		// This is new change that i did
		baseURI= "https://reqres.in/api/users";
		given().queryParams("Page","2").when().get().then().statusCode(200);		
	}

}
