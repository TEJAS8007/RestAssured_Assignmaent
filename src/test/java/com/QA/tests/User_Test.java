package com.QA.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.QA.Endpoints.API_Endpoints;
import com.QA.Payloads.User_Payload;
import com.QA.utilities.Property_Reader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class User_Test {

	
	User_Payload user;
	API_Endpoints endpoint;
	Faker faker;
	ObjectMapper obj;
	static String payload;
	Logger log;
	static String id;
	
	@BeforeClass
	public void set_Up() {
		
		user=new User_Payload();
		endpoint=new API_Endpoints();
		faker=new Faker();
		obj=new ObjectMapper();
		log=LogManager.getLogger(this.getClass());
		
		user.setName(faker.name().firstName());
		user.setJob(faker.job().toString());
		
		try {
			 payload= obj.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("..............User Api Testing started..................");
	}
	
	@Test(priority = 1)
	public void create_User_Test() {
		log.info("..............Create Api started..................");
		Response res= API_Endpoints.create_User(user);
		System.out.println(res.statusLine());
		
		id=res.jsonPath().getString("id");
		System.out.println(id);
		
		
		if(res.statusLine().equals(Property_Reader.init_Prop().get("post"))) {
			Assert.assertTrue(true);
			log.info("Post Request Status Line Matched...");
		} else {
			Assert.assertTrue(false);
			log.error("Post Request Status Line Not Matched...");
		}
	}
	
	@Test(priority = 2)
	public void get_user_Test() {
		log.info("..............Get Api started..................");
  
		Response res= API_Endpoints.get_user(id);
		System.out.println(res.statusLine());
		System.out.println(res.body().prettyPrint());
		
		if(res.statusLine().equals(Property_Reader.init_Prop().get("get"))) {
			Assert.assertTrue(true);
			log.info("Get Request Status Line Matched...");
		} else {
			Assert.assertTrue(false);
			log.error("Get Request Status Line Not Matched...");
		}
	}
	
	@Test(priority = 3)
	public void Delete_user_Test() {
		log.info("..............Delete Api started..................");
  
		Response res= API_Endpoints.Delete_user(id);
		System.out.println(res.statusLine());
		
		if(res.statusLine().equals(Property_Reader.init_Prop().get("delete"))) {
			Assert.assertTrue(true);
			log.info("Delete Request Status Line Matched...");
		} else {
			Assert.assertTrue(false);
			log.error("Delete Request Status Line Not Matched...");
		}
	}
}
