package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.entities.Greeting;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
public class HelloControllerTest {
	
	@Autowired
	private TestRestTemplate template;
	
	@Test
	void testHello() {
		Greeting response = template.getForObject("/rest?name=Dolly", Greeting.class);
		assertEquals("Hello Dolly!", response.getMessage());
	}
}
