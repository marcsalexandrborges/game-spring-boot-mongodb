package com.marcosborgesgamemongo.domain;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="gameResults")
public class GameResults<fun> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String playerId;
	private String gameId;
	private String win;
	private String timestamp;
	
	public static void main(LocalDateTime[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data formatada: " + now.format(formatter));
	}
	
	public GameResults() {
		
	}
	
		
	public GameResults(String playerId, String gameId, String win, String timestamp) {
		
		this.playerId = playerId;
		this.gameId = gameId;
		this.win = win;
		this.timestamp = timestamp;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gameId == null) ? 0 : gameId.hashCode());
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((win == null) ? 0 : win.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameResults other = (GameResults) obj;
		if (gameId == null) {
			if (other.gameId != null)
				return false;
		} else if (!gameId.equals(other.gameId))
			return false;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (win == null) {
			if (other.win != null)
				return false;
		} else if (!win.equals(other.win))
			return false;
		return true;
	}

	

}

	



