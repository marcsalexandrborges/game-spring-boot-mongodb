package com.marcosborgesgamemongo.domain;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class GameResults<fun> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long playerId;
	private Long gameId;
	private Long win;
	private String timestamp;
	

	public GameResults(Long playerId, Long gameId, Long win, String timestamp ) {
	
		this.playerId = playerId;
		this.gameId = gameId;
		this.win = win;
		this.timestamp=timestamp;
		
	}
	
	

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data formatada: " + now.format(formatter));
    }



	public Long getPlayerId() {
	return playerId;
}

	public void setPlayerId(Long playerId) {
	this.playerId = playerId;
}

	public Long getGameId() {
	return gameId;
}

	public void setGameId(Long gameId) {
	this.gameId = gameId;
}

	public Long getWin() {
	return win;
}

	public void setWin(Long win) {
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
		return true;
	}
	
}


