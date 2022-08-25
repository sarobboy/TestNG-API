package org.petstore;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.data.PetDetails;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RestServices {
	
	static int id;
	@DataProvider(name="pet")
	public Object[][] getPet(){
		return new Object[][] {{222,"Husky"},{203,"ChowChow"},{221,"Shitzu"}};
	}
	@Test(priority =1,dataProvider="pet")
	public void addPet( int id,String name) {
	RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		//add a new pet
		String postResponse = given().log().all().header("Content-Type","application/json").body(PetDetails.petData(id,name,"status"))
		.when().post("/pet")
		.then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println("Response: " + postResponse);
		
		JsonPath j = new JsonPath(postResponse);
		 id = j.get("id");
		System.out.println("Pet ID is : "+ id);
	}
		
		//get pet by id
		@Test(priority =2)
	     public void retrievePet() {
			given().log().all().header("Content-Type","application/json").pathParam("id", id)
		.when().get("/pet/{id}")
		.then().log().all().assertThat().statusCode(200);
	}
		
		// update the pet
		  @Test(priority=3)
		  public void updatePet(){
				given().log().all().header("Content-Type","application/json").body(PetDetails.petData(567,"cat","sold"))
				.when().put("/pet")
				.then().log().all().assertThat().statusCode(200);
			}
			
		  @Test(priority=4)
		  public void findByStatus(){
			  given().log().all().header("Content-Type","application/json").queryParam("status","sold")
			  .when().get("/pet/findByStatus")
			 .then().log().all().assertThat().statusCode(200);
		  }
	

}
 