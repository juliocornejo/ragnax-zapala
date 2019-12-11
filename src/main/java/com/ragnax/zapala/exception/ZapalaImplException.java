package com.ragnax.zapala.exception;

import java.io.Serializable;

public class ZapalaImplException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7672936385153673862L;

	public ZapalaImplException(){
		super();
	}

	public ZapalaImplException(String message){
		super(message);
	}
	
	public ZapalaImplException(String message, Throwable cause){
		super(message, cause);
	}
	
	
	public ZapalaImplException(Throwable cause){
		super(cause);
	}
}
