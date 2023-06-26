package com.maranoart.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandartError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String error;
	private String messagem;
	private String path;
	
	public StandartError() {
	}

	public StandartError(Long timestamp, Integer status, String error, String messagem, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.messagem = messagem;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessagem() {
		return messagem;
	}

	public void setMessagem(String messagem) {
		this.messagem = messagem;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
