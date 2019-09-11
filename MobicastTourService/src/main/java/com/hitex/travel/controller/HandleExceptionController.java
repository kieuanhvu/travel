package com.hitex.travel.controller;

import com.hitex.mobicastutil.exception.ApplicationException;
import com.hitex.travel.dto.response.ResponseError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author MaiPH
 */
@ControllerAdvice
public class HandleExceptionController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = {ApplicationException.class})
    protected ResponseEntity<Object> handleApplicationException(
            ApplicationException ex, WebRequest request) {
        ResponseError response = new ResponseError();
        return handleExceptionInternal(ex, 
                new ResponseEntity<ResponseError>(response,HttpStatus.INTERNAL_SERVER_ERROR),
                new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR,
                request);
    }
}
