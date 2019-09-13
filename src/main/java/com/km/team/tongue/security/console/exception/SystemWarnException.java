package com.km.team.tongue.security.console.exception;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午2:36
 * Description: 系统警告级别异常,该异常不会触发告警逻辑，只会对异常信息进行记录
 */
public class SystemWarnException extends BaseSystemException {

    public SystemWarnException(String errorCode, String errorMsg, String extraMsg) {
        super(errorCode, errorMsg, extraMsg);
    }

    public SystemWarnException(String errorCode, String errorMsg, String extraMsg, Throwable cause) {
        super(errorCode, errorMsg, extraMsg, cause);
    }
}
