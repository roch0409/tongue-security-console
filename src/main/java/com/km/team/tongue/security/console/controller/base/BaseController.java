package com.km.team.tongue.security.console.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;

/**
 * Author: jiangjun
 * Date: 2018/9/11
 * Time: 下午2:25
 * Description:
 */
public class BaseController<T> extends ServiceContainer {

    protected Logger logger = null;

    /**
     * 实例化子类对应的logger
     */
    public BaseController() {
        try {
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
            logger = LoggerFactory.getLogger(clazz);
        } catch (Exception e) {
            logger = LoggerFactory.getLogger(BaseController.class);
            logger.error("BaseController获取子类类型异常！", e);
            throw new RuntimeException("BaseController获取子类类型异常！", e);
        }
    }
}
