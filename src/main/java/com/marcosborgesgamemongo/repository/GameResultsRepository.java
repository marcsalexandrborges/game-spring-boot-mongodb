package com.marcosborgesgamemongo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marcosborgesgamemongo.domain.GameResults;

@Repository
public interface GameResultsRepository extends MongoRepository<GameResults, Long>{

	Optional<GameResults> findByplayerId(String playerid);

	



	

	


}
