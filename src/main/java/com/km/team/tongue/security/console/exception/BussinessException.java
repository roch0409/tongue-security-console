package com.km.team.tongue.security.console.exception;

/**
 * Author: jiangjun
 * Date: 2018/9/15
 * Time: 下午5:04
 * Description: 业务异常
 */
public class BussinessException extends BaseSystemException {

    public BussinessException(String errorCode, String errorMsg, String extraMsg) {
        super(errorCode, errorMsg, extraMsg);
    }

    public BussinessException(String errorCode, String errorMsg, String extraMsg, Throwable cause) {
        super(errorCode, errorMsg, extraMsg, cause);
    }
}
