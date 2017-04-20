package com.wyw.enums;

/**
 * Created by Administrator on 2017/4/18.
 */
public enum ResultEnum {
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(1,"你还在上小学吧"),
    MIDDLE_SCHOOL(2,"你可能在上初中"),
    UNKNOW_ERROR(-1,"未知错误"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
