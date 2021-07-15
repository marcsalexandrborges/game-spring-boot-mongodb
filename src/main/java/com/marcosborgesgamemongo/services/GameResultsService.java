package com.marcosborgesgamemongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcosborgesgamemongo.domain.GameResults;
import com.marcosborgesgamemongo.dto.GameResultsDTO;
import com.marcosborgesgamemongo.repository.GameResultsRepository;
import com.marcosborgesgamemongo.services.exception.ObjectNotFoundException;

@Service
public class GameResultsService{
	
	@Autowired
	private GameResultsRepository repo;
	
	public List<GameResults> findAll(){
		return repo.findAll();
	}
	
	public GameResults findByplayerId(String playerid) {
		Optional<GameResults> obj= repo.findByplayerId(playerid);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public GameResults insert(GameResults obj) {
		return repo.insert(obj);
	}
	
	public GameResults fromDTO(GameResultsDTO objDto) {
		return new GameResults(objDto.getPlayerId(), objDto.getGameId(), objDto.getWin(), objDto.getTimestamp());
		
	}
}
	
