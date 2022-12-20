package com.myex.handler.custom.excep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyArrayIndexOutOfBoundException extends ParentException {
    Logger LOGGER = LoggerFactory.getLogger(MyArrayIndexOutOfBoundException.class);

    public MyArrayIndexOutOfBoundException(String myException) {
        super(myException);
    }

    @Override
    public void hanleError() {
        LOGGER.error("ERROR FROM MyArrayIndexOutOfBoundException: " + getMyException());
    }

    @Override
    public void handleWarning() {
        LOGGER.warn("WARN FROM MyArrayIndexOutOfBoundException: " + getMyException());
    }
}
