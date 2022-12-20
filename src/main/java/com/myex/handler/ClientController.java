package com.myex.handler;

import com.myex.handler.custom.excep.MyArrayIndexOutOfBoundException;
import com.myex.handler.custom.excep.MyNullPointerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exceptionstestester")
public class ClientController {


    @Autowired
    com.myex.handler.util.ExceptionUtil exceptionUtil;

    @GetMapping("/nullpointer/error")
    public String errorEndpoint() {

        exceptionUtil.logError(new MyNullPointerException("  1"));
        return "error";
    }


    @GetMapping("/nullpointer/warn")
    public String warnEndpoint() {

        exceptionUtil.logWarn(new MyNullPointerException(" 2"));
        return "warn";
    }


    @GetMapping("/arrayindex/error")
    public String arrayindexErrorEndpoint() {

        exceptionUtil.logError(new MyArrayIndexOutOfBoundException(" 3"));
        return "error";
    }
    @GetMapping("/arrayindex/warn")
    public String arrayindexWarnEndpoint() {

        exceptionUtil.logWarn(new MyArrayIndexOutOfBoundException(" 4"));
        return "warn";
    }

}
