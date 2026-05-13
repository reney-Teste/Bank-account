package com.reney.model.exceptions;

public class DomainException extends Exception {

    public DomainException(){
        super();
    }

    public DomainException(String msg){
        super(msg);
    }

    public DomainException(String msg, Throwable cause){
        super(msg, cause);
    }

    public DomainException(Throwable cause){
        super(cause);
    }
}

