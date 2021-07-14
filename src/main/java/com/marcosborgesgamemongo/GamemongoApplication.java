package com.marcosborgesgamemongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class GamemongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamemongoApplication.class, args);
	}

}
