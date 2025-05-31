package com.QA.Endpoints;

import com.QA.Payloads.User_Payload;
import com.QA.utilities.Property_Reader;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class API_Endpoints {

	public static Response create_User(User_Payload user) {
		
		Response res= RestAssured.given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.header(Property_Reader.init_Prop().getProperty("key"),
				Property_Reader.init_Prop().getProperty("value"))
		.body(user)
		.when().post(Routes.create_User_url);
		
		return res;
	}
	
	public static Response get_user(String id) {
		
		Response res= RestAssured.given()
				.accept(ContentType.JSON)
				.header(Property_Reader.init_Prop().getProperty("key"),
						Property_Reader.init_Prop().getProperty("value"))
				.when().get(Routes.Get_User_url+id);
		return res;
		
	}
	
	public static Response Delete_user(String id) {
		
		Response res= RestAssured.given()
				.accept(ContentType.JSON)
				.header(Property_Reader.init_Prop().getProperty("key"),
						Property_Reader.init_Prop().getProperty("value"))
				.when().delete(Routes.Delete_User_url+id);
		return res;
		
	}
}
