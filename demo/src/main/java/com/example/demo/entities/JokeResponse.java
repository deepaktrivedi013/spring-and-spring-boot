package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JokeResponse {
	
	private String type;
	
	@JsonProperty("value")
	private Joke joke;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Joke getJoke() {
		return joke;
	}

	public void setJoke(Joke joke) {
		this.joke = joke;
	}

	
	

}
