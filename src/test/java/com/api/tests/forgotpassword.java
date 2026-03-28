package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.request.SignUpRequest;

import io.restassured.response.Response;

public class forgotpassword {

	@Test(description = " verify login test is working or not...")
	public void CreateAccountTest() {
		

		AuthService auth = new AuthService();
		Response response =auth.forgotpassword("panchanijayshree1@gmail.com");
		
		System.out.println(response.asPrettyString());

	}

}
