package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entities.JokeResponse;

@Service
public class JokeService {
	
	
	private static final String BASE = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";
	private RestTemplate restTemplate;
	
	@Autowired
	public JokeService(RestTemplateBuilder builder) {
		restTemplate = builder.build();
	}
	
	public String getJoke(String firstName, String lastName) {
		JokeResponse resp = restTemplate.getForObject(String.format("%s&firstName=%s&lastName=%s", BASE, firstName, lastName), JokeResponse.class);
		return resp.getJoke().getJoke();
	}

}
