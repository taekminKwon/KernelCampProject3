package com.example.rest_api;

import com.example.rest_api.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {
		var user = new UserRequest();
		user.setName("홍길동");
		user.setEmail("hong@gmail.com");
		user.setUserAge(15);
		user.setIsKorean(true);

		var json = objectMapper.writeValueAsString(user);
		System.out.println(json);

		//var dto = objectMapper.readValue(json, UserRequest.class);
		//System.out.println(dto);
	}

}
