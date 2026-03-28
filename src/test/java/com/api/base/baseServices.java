package com.api.base;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class baseServices {

	private static final String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestspecification;
	
	
	static{

		//RestAssured.filters(new LoggingFilter());
	}

	public baseServices() {
		requestspecification = given().baseUri(BASE_URL);
	}

	protected Response postrequest(Object payload, String endpoin) {
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoin);
	}
	protected Response putrequest(Object payload, String endpoin) {
		return requestspecification.contentType(ContentType.JSON).body(payload).put(endpoin);
	}

	protected Response getrequest(String endpoint) {
		return requestspecification.get(endpoint);
	}

	protected Response postrequest(String baseUrl, Object payload, String endpoin) {
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoin);

	}
	protected void setAuthtokan(String token) {
		requestspecification.header("Authorization","Bearer "+token);
		
			
		
	}
}
