package com.marcosborgesgamemongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.marcosborgesgamemongo.domain.GameResults;
import com.marcosborgesgamemongo.dto.GameResultsDTO;
import com.marcosborgesgamemongo.services.GameResultsService;

@RestController
@RequestMapping(value="/gameResults")


public class GameResultsResource {
	
	@Autowired
	private GameResultsService service;
	

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<GameResultsDTO>> findAll(){
		List<GameResults> list = service.findAll();
		List<GameResultsDTO> listDto = list.stream().map(x -> new GameResultsDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

}
