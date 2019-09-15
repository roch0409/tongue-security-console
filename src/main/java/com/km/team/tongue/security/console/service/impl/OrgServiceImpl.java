package com.km.team.tongue.security.console.service.impl;

import com.km.team.tongue.security.console.dao.mybatis.custom.TorganizationMapperCustom;
import com.km.team.tongue.security.console.service.IOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: jiangjun
 * Date: 2019/9/9
 * Time: 11:42 下午
 * Description:
 */
@Service("orgService")
public class OrgServiceImpl implements IOrgService {

    @Autowired
    private TorganizationMapperCustom mapperCustom;

    @Override
    public Map<String, Object> getTotal() {
        int todayTotal = mapperCustom.getTodayTotal();
        int previousTotal = mapperCustom.getPreviousTotal();
        Map<String, Object> map = new HashMap<>(2);
        map.put("todayTotal", todayTotal);
        map.put("previousTotal", previousTotal);
        return map;
    }

    @Override
    public int getLastWeekTotal() {
        return mapperCustom.getLastWeekTotal();
    }

    @Override
    public List<HashMap<String, Object>> getRealTimeOrgJoin() {
        return mapperCustom.getRealTimeOrgJoin();
    }

    @Override
    public List<HashMap<String, Object>> getRegionStatistics() {
        return mapperCustom.getRegionStatistics();
    }

    @Override
    public List<HashMap<String, Object>> getCompanyRatio() {
        return mapperCustom.getCompanyRatio();
    }

    @Override
    public Integer getTotalByUnitName(String name) {
        return mapperCustom.getTotalByUnitName(name);
    }

    @Override
    public Integer getWeekIncrTotal() {
        return mapperCustom.getWeekIncrTotal();
    }
}
