package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileResponse;
import com.api.request.LoginRequest;
import com.api.request.SignUpRequest;

import io.restassured.response.Response;

public class getprofilerequestTest {

	@Test(description = " verify login test is working or not...")
	public void getprofileinfo() {
		
		
		
		AuthService auth = new AuthService();
		Response response=auth.login(new LoginRequest("ram1234","ram1234"));
		LoginResponse loginresponse =response.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());
		UserProfileManagmentService profile =new UserProfileManagmentService();
		response=profile.getprofile(loginresponse.getToken());
		UserProfileResponse userprofileresponse =response.as(UserProfileResponse.class); 
		System.out.println(userprofileresponse.getFirstName());
		
	}

}
