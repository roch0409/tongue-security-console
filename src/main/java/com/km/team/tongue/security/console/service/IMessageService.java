package com.km.team.tongue.security.console.service;

import java.util.Map;

/**
 * Author: jiangjun
 * Date: 2019/9/14
 * Time: 12:06 上午
 * Description:
 */
public interface IMessageService {

    /**
     * 厨师警告统计
     * @return
     */
    Map<String, Map<String, Object>> getCookWarn();

    /**
     * 湿度、温度、持证上岗
     * @return
     */
    Map<String, Map<String, Object>> getDegreeWarn();

    /**
     * 消毒柜、留样柜、紫外灯
     * @return
     */
    Map<String, Map<String, Object>> getCabinetWarn();

}
