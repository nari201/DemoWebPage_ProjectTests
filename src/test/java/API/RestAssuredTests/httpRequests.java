package API.RestAssuredTests;

import javax.annotation.meta.When;

import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.opentelemetry.sdk.logs.data.Body;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.module.jsv.JsonSchemaValidator.*;
import net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForGivenType;

/*
  given() -->( Pre Req)
   --- ContentType, cookies, add auth, add Parems, set Headers info etc... 
  
  When() --> Methods
  --- Get, Post, Put,Patch etc...
  
  Then() --> Validations
    ----Validate status codes, extract response, extrach cookies/headers & Body
 * 
 */

public class httpRequests {

	 int id;

	@Test (priority = 1)
	public void getUser() {

		given()

				.when()
					.get("https://reqres.in/api/users/2")

				.then()
					.statusCode(200).log().all();
	}	

	@Test (priority = 2)
	public void createUser() {

		HashMap<String, String> data = new HashMap<>();

		data.put("name", "Naresh");
		data.put("job", "IT");
		

		id=given()
			.contentType("application/json")
			.body(data)
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
		
	}
	@Test(priority = 3 , dependsOnMethods = {"createUser"})
	public void updateUser() {

		HashMap<String, String> data = new HashMap<>();

		data.put("name", "Naresh");
		data.put("job", "Updated IT");
		

		given()
			.contentType("application/json")
			.body(data)
			
		.when()
			.put("https://reqres.in/api/users/"+id)
		
		.then()
				.statusCode(200)
				.log().all(); 
	}
	@Test(priority = 4 , dependsOnMethods = {"createUser"})
	public void deleteUser() {

		HashMap<String, String> data = new HashMap<>();

		data.put("name", "Naresh");
		data.put("job", "Updated IT");
		

		when()
			.delete("https://reqres.in/api/users/"+id)
		
		.then()
				.statusCode(204)
				.log().all(); 
	}
}
