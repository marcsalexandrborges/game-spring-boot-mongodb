package com.marcosborgesgamemongo.resources;


import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@RequestMapping(value="/{playerid}",method=RequestMethod.GET)
	public ResponseEntity<GameResultsDTO> findByplayerId(@PathVariable String playerid){
		GameResults obj = service.findByplayerId(playerid);
		return ResponseEntity.ok().body(new GameResultsDTO(obj));
	}
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody GameResultsDTO objDto){
		GameResults obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{playerid}").buildAndExpand(obj.getPlayerId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
}
