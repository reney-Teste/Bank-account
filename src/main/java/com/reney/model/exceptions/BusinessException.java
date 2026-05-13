package com.reney.model.exceptions;

public class BusinessException extends RuntimeException {

    public BusinessException(){
        super();
    }

    public BusinessException(String msg){
        super(msg);
    }

    public BusinessException(String msg, Throwable cause){
        super(msg, cause);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }
}

