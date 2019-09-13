package com.km.team.tongue.security.console.beans.vo;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午1:04
 * Description: 返回实体
 */
public class ResponseData<T> {

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据实体
     */
    private T data;


    @Override
    public String toString() {
        return "ResponseData{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
