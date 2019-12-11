package com.ragnax.zapala.utilidades;

import java.sql.Timestamp;

import com.ragnax.zapala.controller.modelo.Zapala;
import com.ragnax.zapala.controller.modelo.ZapalaRequest;
import com.ragnax.zapala.exception.ZapalaImplException;

public interface Chapala {

	public Zapala generarTiempoDuracion(ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public Timestamp convertirStrFechaConFormatToTimestamp(ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public boolean isValidDate(ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public boolean validarPatronEmail(ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public Zapala generarPatronRUT(ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public Zapala generarCodigoByNumeroByEncodear (ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public Zapala generarCodigoByNumero(ZapalaRequest zapalaRequest) throws ZapalaImplException;
	
	public Zapala getMD5(ZapalaRequest zapalaRequest)  throws ZapalaImplException;
	
	public <T> Zapala generacionSHA(T content, Class<T> typeRequest);
	
	public <T> Zapala generacionSHA(ZapalaRequest zapalaRequest) throws ZapalaImplException;
}
