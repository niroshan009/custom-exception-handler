package com.myex.handler.util;

import com.myex.handler.custom.excep.ParentException;
import org.springframework.stereotype.Component;


@Component
public class ExceptionUtil {

    public void logError(ParentException exception) {
        exception.hanleError();
    }

    public void logWarn(ParentException exception) {
        exception.handleWarning();
    }

}
