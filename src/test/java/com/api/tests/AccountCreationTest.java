package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = " verify login test is working or not...")
	public void CreateAccountTest() {
		SignUpRequest signuprwquest = new SignUpRequest.Builder()
				.username("Durga123")
				.email("durga@gmail.com")
				.password("1234")
				.firstname("Durga")
				.lastname("patile")
				.mobilenumber("2477576746")
				.build();

		AuthService auth = new AuthService();
		Response response = auth.signup(signuprwquest);
		System.out.println(response.asPrettyString());

	}

}
