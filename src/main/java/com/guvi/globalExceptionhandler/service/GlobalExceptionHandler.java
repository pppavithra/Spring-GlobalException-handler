package com.guvi.globalExceptionhandler.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{


        @ExceptionHandler({ProductnotFound.class})
        public ResponseEntity<Object> handleProductNotFoundException (ProductnotFound exception){
            //return response internal,bad request,//exception
            return  ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(exception.getMessage());
        }

        //Product already exist exception

    @ExceptionHandler({ProductAlreadyExist.class})
    public ResponseEntity<Object> handleProductAlreadyExistException (ProductAlreadyExist exception){
        //return response internal,bad request,//exception
        return  ResponseEntity
                .status(HttpStatus.ALREADY_REPORTED)
                .body(exception.getMessage());
    }

//Exception and Error






    }
