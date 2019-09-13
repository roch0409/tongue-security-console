package com.km.team.tongue.security.console.utils;


import com.km.team.tongue.security.console.beans.vo.ResponseData;
import com.km.team.tongue.security.console.enums.ResultEnum;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午1:37
 * Description: 返回结果工具类
 */
public class ResponseDataUtil {

    /**
     * 默认创建返回成功
     * @return
     */
    public static ResponseData buildSuccess(){
        ResponseData responseData = new ResponseData();
        responseData.setCode(ResultEnum.SUCCESS.getCode());
        responseData.setMsg(ResultEnum.SUCCESS.getMessage());
        return responseData;
    }

    /**
     * 创建返回成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseData buildSuccess(T data){
        ResponseData responseData = new ResponseData();
        responseData.setData(data);
        responseData.setCode(ResultEnum.SUCCESS.getCode());
        responseData.setMsg(ResultEnum.SUCCESS.getMessage());
        return responseData;
    }

    /**
     * 默认创建返回失败
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResponseData buildError(T data){
        ResponseData responseData = new ResponseData();
        responseData.setData(data);
        responseData.setCode(ResultEnum.ERROR.getCode());
        responseData.setMsg(ResultEnum.ERROR.getMessage());
        return responseData;
    }

    /**
     * 创建指定错误信息返回
     * @param resultEnum
     * @return
     */
    public static ResponseData buildError(ResultEnum resultEnum){
        ResponseData responseData = new ResponseData();
        responseData.setCode(resultEnum.getCode());
        responseData.setMsg(resultEnum.getMessage());
        return responseData;
    }

    /**
     * 返回自定义错误信息
     * @param code
     * @param msg
     * @return
     */
    public static ResponseData buildError(String code, String msg){
        ResponseData responseData = new ResponseData();
        responseData.setCode(code);
        responseData.setMsg(msg);
        return responseData;
    }
}
