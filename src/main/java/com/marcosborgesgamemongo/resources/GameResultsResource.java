package com.marcosborgesgamemongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcosborgesgamemongo.domain.GameResults;

@RestController
@RequestMapping(value="/gameResults")


public class GameResultsResource {
	

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<GameResults>> findAll(){
		GameResults GameResults = new GameResults(1L,34L,100L,"2018-01-03 10:30:12");
		
		
		
		List<GameResults>list=new ArrayList<>();
		list.addAll(Arrays.asList(GameResults));
		return ResponseEntity.ok().body(list);
	}

}
