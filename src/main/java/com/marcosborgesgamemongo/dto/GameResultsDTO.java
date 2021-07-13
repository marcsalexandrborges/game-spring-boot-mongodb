package com.marcosborgesgamemongo.dto;

import java.io.Serializable;

import com.marcosborgesgamemongo.domain.GameResults;

public class GameResultsDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String playerId;
	private String gameId;
	private String win;
	private String timestamp;
	
	public GameResultsDTO() {
		
	}
	
	public GameResultsDTO(GameResults obj) {
		playerId = obj.getPlayerId();
		gameId = obj.getGameId();
		win = obj.getWin();
		timestamp = obj.getTimestamp();
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getWin() {
		return win;
	}

	public void setWin(String win) {
		this.win = win;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
