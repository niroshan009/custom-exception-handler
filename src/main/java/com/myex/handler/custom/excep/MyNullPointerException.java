package com.myex.handler.custom.excep;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyNullPointerException extends ParentException{
    Logger LOGGER = LoggerFactory.getLogger(MyNullPointerException.class);
     public MyNullPointerException(String myException) {
        super(myException);
    }

    @Override
    public void hanleError() {
      LOGGER.error("ERROR FROM MyNullPointerException: "+ this.getMyException());
    }

    @Override
    public void handleWarning() {
        LOGGER.error("WARN FROM MyNullPointerException: "+ this.getMyException());
    }
}
