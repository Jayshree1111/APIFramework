package com.api.base;

import com.api.request.ProfileRequest;

import io.restassured.response.Response;

public class UserProfileManagmentService extends baseServices{
	private static final String BASE_PATH = "/api/users";
	
	public Response getprofile(String token) {
		setAuthtokan(token);
		return getrequest(BASE_PATH +"/profile");
	}
	public Response updateprofile(String token ,ProfileRequest payload) {
		setAuthtokan(token);
		return putrequest(payload,BASE_PATH +"/profile");
	}
	
	
	
	
	
	

}
