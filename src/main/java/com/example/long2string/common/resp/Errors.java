package com.example.long2string.common.resp;

public enum Errors {
    INVALID_PARAMS(1, "传入参数不合法"),
    REPEAT_DATA(2, "数据重复"),
    RECORD_NOT_EXISTS(3, "记录不存在"),
    RECORD_LIMITED(4, "数据限制"),
    REGISTER_FAILED(5, "用户注册失败"),
    INTERNAL_ERROR(6, "服务器发生错误"),
    ACCOUNT_NOT_EXIST(7, "用户名不存在"),
    ERROR_PATH(8, "请求路径出错"),
    METHOD_NOT_SUPPORTED(9, "请求方法错误"),
    SQL_Exception(10, "SQL 语句错误");

    private final int code;
    private final String message;

    Errors(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}