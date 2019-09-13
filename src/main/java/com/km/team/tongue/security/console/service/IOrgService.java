package com.km.team.tongue.security.console.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: jiangjun
 * Date: 2019/9/9
 * Time: 11:41 下午
 * Description:
 */
public interface IOrgService {

    /**
     * 数量统计
     * @return
     */
    Map<String, Object> getTotal();

    /**
     * 上周新增接入数量
     * @return
     */
    int getLastWeekTotal();

    /**
     * 实时单位接入统计
     * @return
     */
    List<HashMap<String, Object>> getRealTimeOrgJoin();

    /**
     * 各地市接入单位数量统计排行
     * @return
     */
    List<HashMap<String, Object>> getRegionStatistics();

}
