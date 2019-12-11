package com.ragnax.zapala.controller.modelo;

import java.io.Serializable;

public class RagnaxError implements Serializable{

	private static final long serialVersionUID = 5379307160546001781L;

	private int codigo;
	private String mensaje;
	
	public RagnaxError() {
		super();
	}
	
	
	public RagnaxError(int codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
