package com.km.team.tongue.security.console.dao.mybatis.custom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TorganizationMapperCustom {

    int getPreviousTotal();

    int getTodayTotal();

    int getLastWeekTotal();

    List<HashMap<String, Object>> getRealTimeOrgJoin();

    /**
     * 各地市接入单位数量统计排行
     * @return
     */
    List<HashMap<String, Object>> getRegionStatistics();

    /**
     * 各类餐饮企业占比统计
     * @return
     */
    List<HashMap<String, Object>> getCompanyRatio();
}