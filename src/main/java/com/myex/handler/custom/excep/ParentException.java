package com.myex.handler.custom.excep;

public abstract class ParentException extends Exception{
    private String myException;

    public ParentException(String myException) {
        super(myException);
        this.myException = myException;
    }

    public String getMyException() {
        return myException;
    }

    public abstract void hanleError();

    public abstract void handleWarning();
}
