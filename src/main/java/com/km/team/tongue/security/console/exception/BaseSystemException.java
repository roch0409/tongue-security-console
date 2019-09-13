package com.km.team.tongue.security.console.exception;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午3:01
 * Description:
 */
public class BaseSystemException extends RuntimeException {

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 错误附加信息
     * 输入参数等信息
     */
    private String extraMsg;

    public BaseSystemException(String errorCode,String errorMsg,String extraMsg){
        super("errorCode: " + errorCode + " ^_^ errorMsg: " + errorMsg + " ^_^ extraMsg: " + extraMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.extraMsg = extraMsg;
    }

    public BaseSystemException(String errorCode,String errorMsg,String extraMsg, Throwable cause){
        super("errorCode: " + errorCode + " ^_^ errorMsg: " + errorMsg + " ^_^ extraMsg: " + extraMsg, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.extraMsg = extraMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getExtraMsg() {
        return extraMsg;
    }

    public void setExtraMsg(String extraMsg) {
        this.extraMsg = extraMsg;
    }
}
