package com.marcosborgesgamemongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcosborgesgamemongo.domain.GameResults;
import com.marcosborgesgamemongo.repository.GameResultsRepository;

@Service
public class GameResultsService {
	
	@Autowired
	private GameResultsRepository repo;
	
	public List<GameResults> findAll(){
		return repo.findAll();
		
	}

}
