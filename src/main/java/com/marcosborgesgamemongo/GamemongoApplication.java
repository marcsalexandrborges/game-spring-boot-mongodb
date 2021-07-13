package com.marcosborgesgamemongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.mvc.ServletWrappingController;

@SpringBootApplication
@ComponentScan
public class GamemongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamemongoApplication.class, args);
	}

}
