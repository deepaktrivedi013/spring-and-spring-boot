package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class JokeServiceTest {
	
	private Logger logger = LoggerFactory.getLogger(JokeServiceTest.class);
	
	@Autowired
	private JokeService service;
	@Test
	void testJoke() {
		String joke = service.getJoke("Craig", "Walls");
		logger.info("The joke is " + joke);
		assertTrue(joke.contains("Craig"));
	}

}
