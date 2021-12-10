package com.misiontic.pedidos_idilireo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody

public class pedidoNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(pedidoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(pedidoNotFoundException ex){
        return ex.getMessage();
    }
}
