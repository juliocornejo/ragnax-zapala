package com.ragnax.zapala.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ragnax.zapala.controller.modelo.RagnaxError;
import com.ragnax.zapala.exception.ZapalaImplException;

/**
 * Created by julito el mas lindo on 09-08-19.
 */
@ControllerAdvice
@ResponseBody
public class ExceptionControllerAdvice {

    private static final Logger LOGGER = LogManager.getLogger(ExceptionControllerAdvice.class);

    /**
     * Metodo que captura la excepcion generada al no poder ser enviado el correo.
     *
     * @param mailEx excepcion del tipo MailException.
     * @return ResponseEntity<Response> con el error capturado y el codigo HTTP
     */
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ExceptionHandler(ZapalaImplException.class)
    public ResponseEntity<RagnaxError> handlerException(ZapalaImplException zie) {
        LOGGER.error("Error en zapala: {} .", zie.getMessage());
        /**Servicio Ok, Error en Negocio*/
        return new ResponseEntity<>(new RagnaxError(HttpStatus.ACCEPTED.value(), zie.getMessage()),
                HttpStatus.ACCEPTED);
       
    }
}