package com.km.team.tongue.security.console.enums;

/**
 * 返回码定义
 */
public enum ResultEnum {
    SUCCESS("0000", "操作成功"),
    ERROR("1111", "操作异常"),
    // 2 开头的错误码为参数类异常
    BUSINESS_ERROR("4000", "业务数据异常"),
    REDIS_ERROR("3000", "Redis异常"),
    PARAM_ERROR("2000", "参数校验不合法"),
    VERIFY_CODE_ERROR("2001", "验证码不合法"),
    // 1 开头的错误码为框架类异常
    INTERNAL_ERROR("1000", "系统框架处理异常")
    ;

    private String code;

    private String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
