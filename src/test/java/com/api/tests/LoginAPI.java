package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.model.response.LoginResponse;
import com.api.request.LoginRequest;

import io.restassured.response.Response;

public class LoginAPI {
	
	@Test(description =" verify login test is working or not...")
	public void loginTest() {
		
		LoginRequest loginrequest =new LoginRequest("ram1234","ram1234");
		AuthService auth =new AuthService();
		Response response =auth.login(loginrequest);
		LoginResponse loginresponse=response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginresponse.getId());
		Assert.assertEquals(loginresponse.getId(), 641);
	}

}
