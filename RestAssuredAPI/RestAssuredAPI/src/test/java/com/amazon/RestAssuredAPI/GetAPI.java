package com.amazon.RestAssuredAPI;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetAPI {
	@org.testng.annotations.Test
	public void getEmployeeDetails() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/";
		RequestSpecification httpRequest = RestAssured.given();
		// Set HTTP Headers
		// httpRequest.header("Content-Type", "application/json");
		Response response = httpRequest.get("api/v1/employees");
		// Get Response Body
		ResponseBody responsebody = response.getBody();

		int responsecode = response.getStatusCode();

		Assert.assertEquals(responsecode, 200, "Statuscode not Successful");
//System.out.println("----->"+responsecode);
		JsonPath jsonpath = response.jsonPath();
        //Get Employee name
		String employeename = jsonpath.get("data[0].employee_name");
		//Assert Employee name
		Assert.assertEquals(employeename, "Tiger Nixon", "Name not Matching");

		/*
		 * String employeesalary= jsonpath.getString("data[0].employee_salary");
		 * Assert.assertEquals(employeesalary, "320800", "Salary not Matching");
		 * 
		 * String employeeage= jsonpath.getString("data[0].employee_salary");
		 * Assert.assertEquals(employeesalary, "61", "Age not Matching");
		 */
	}

}
