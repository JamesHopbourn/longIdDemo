package com.example.long2string.handler;

import com.example.long2string.common.resp.Errors;
import com.example.long2string.common.resp.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sqlite.SQLiteException;

@Slf4j
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 传入参数缺失或者不匹配
     */
    @ExceptionHandler(SQLiteException.class)
    public Result TypeMismatchException() {
        return Result.fail(Errors.SQL_Exception);
    }
}