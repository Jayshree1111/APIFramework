package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.model.response.LoginResponse;
import com.api.request.LoginRequest;
import com.api.request.SignUpRequest;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test(description = " verify login test is working or not...")
	public void CreateAccountTest() {
		

		AuthService auth = new AuthService();
		Response response=auth.login(new LoginRequest("ram1234","ram1234"));
		LoginResponse loginresponse =response.as(LoginResponse.class);
		
		System.out.println("-----------------------------------------");
		
		UserProfileManagmentService servise = new UserProfileManagmentService();
		response=servise.getprofile(loginresponse.getToken());
		System.out.println(response.asPrettyString());
		
	}

}
