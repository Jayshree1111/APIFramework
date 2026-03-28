package com.api.base;

import java.util.HashMap;

import com.api.request.LoginRequest;
import com.api.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends baseServices{
	
	private static final String BASE_PATH ="/api/auth/";
	
	
	  public Response login(LoginRequest  payload) {
		  return postrequest(payload,BASE_PATH+"login");
	  }
	  public Response signup(SignUpRequest  payload) {
		  return postrequest(payload,BASE_PATH+"signup");
	  }
	  public Response forgotpassword(String emailaddress) {
		  HashMap<String, String > payload =new HashMap<String,String>();
		  payload.put("email", emailaddress);
		  return postrequest(payload,BASE_PATH+ "forgot-password");
	  }


}
