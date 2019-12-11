package com.ragnax.zapala.controller.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class ZapalaRequest implements Serializable{

	private static final long serialVersionUID = 5379307160546001781L;

	
	private String prueba;
	private LocalDateTime localDateTime;
	private List<String> listaString; 
	private List<Integer> listaInteger;
	
	
	public ZapalaRequest() {
		super();
	}
	
	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}



	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}


	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}


	public List<String> getListaString() {
		return listaString;
	}


	public void setListaString(List<String> listaString) {
		this.listaString = listaString;
	}


	public List<Integer> getListaInteger() {
		return listaInteger;
	}


	public void setListaInteger(List<Integer> listaInteger) {
		this.listaInteger = listaInteger;
	}
	
}
