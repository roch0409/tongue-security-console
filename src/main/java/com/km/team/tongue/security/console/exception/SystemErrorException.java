package com.km.team.tongue.security.console.exception;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午2:35
 * Description: 系统严重级别异常,该异常会触发告警逻辑
 */
public class SystemErrorException extends BaseSystemException {

    public SystemErrorException(String errorCode, String errorMsg, String extraMsg) {
        super(errorCode, errorMsg, extraMsg);
    }

    public SystemErrorException(String errorCode, String errorMsg, String extraMsg, Throwable cause) {
        super(errorCode, errorMsg, extraMsg, cause);
    }
}
