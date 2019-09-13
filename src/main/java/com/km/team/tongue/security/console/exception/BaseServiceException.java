package com.km.team.tongue.security.console.exception;

/**
 * Author: jiangjun
 * Date: 2018/9/11
 * Time: 下午4:47
 * Description: base service exception
 */
public class BaseServiceException extends BaseSystemException {

    public BaseServiceException(String errorCode, String errorMsg, String extraMsg) {
        super(errorCode, errorMsg, extraMsg);
    }

    public BaseServiceException(String errorCode, String errorMsg, String extraMsg, Throwable cause) {
        super(errorCode, errorMsg, extraMsg, cause);
    }
}
