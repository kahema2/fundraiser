package com.example.fundraiser.exception;

import org.aspectj.bridge.IMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class FundraiserNotFoundException extends RuntimeException{
    public FundraiserNotFoundException(String message){
        super(message);
    }
}
