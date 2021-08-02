package com.amazon.RestAssuredAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class DeleteAPI {
	@Test
	public void deleteEmployeeDetails() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/";
		RequestSpecification httpRequest = RestAssured.given();
		// Set HTTP Headers
		httpRequest.header("Content-Type", "application/json");
		// Initialize EmpID with employeeID to be deleted

		// deleting employee record 7
		Response response = httpRequest.delete("api/v1/delete/7");

		// Get Response Body
		ResponseBody responsebody = response.getBody();
		//System.out.println("--->"+ responsebody.asPrettyString());
		int responsecode = response.getStatusCode();

		// Assert status code
		Assert.assertEquals(responsecode, 200, "DeleteAPI statuscode not successful");
		// Assert success message
		Assert.assertEquals(responsebody.asString().contains("Successfully! Record has been deleted"), true);
	}
}