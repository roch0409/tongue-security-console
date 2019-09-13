package com.km.team.tongue.security.console.service.impl;

import com.km.team.tongue.security.console.dao.mybatis.custom.PushMessageMapperCustom;
import com.km.team.tongue.security.console.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: jiangjun
 * Date: 2019/9/14
 * Time: 12:06 上午
 * Description: 告警信息
 */
@Service("messageService")
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private PushMessageMapperCustom mapperCustom;

    @Override
    public Map<String, Map<String, Object>> getCookWarn() {
        Map<String, Map<String, Object>> map = new HashMap<>(3);
        // 统计当天厨师 白色厨师帽 告警
        HashMap<String, Object> hatMap = mapperCustom.getTotal("422000007");
        map.put("hatMap", hatMap);
        // 统计当天厨师 白色口罩 告警
        HashMap<String, Object> maskMap = mapperCustom.getTotal("422000005");
        map.put("maskMap", maskMap);
        // 统计当天厨师 未穿白色厨师服 告警
        HashMap<String, Object> clothesMap = mapperCustom.getTotal("422000003");
        map.put("clothesMap",clothesMap);
        return map;
    }

    @Override
    public Map<String, Map<String, Object>> getDegreeWarn() {
        Map<String, Map<String, Object>> map = new HashMap<>(3);
        // 统计当天 湿度 告警
        HashMap<String, Object> humidityMap = mapperCustom.getTotal("131627");
        map.put("humidityMap", humidityMap);
        // 统计当天 温度 告警
        HashMap<String, Object> temperatureMap = mapperCustom.getTotal("131625");
        map.put("temperatureMap", temperatureMap);
        // 统计当天 持证上岗
        // TODO:没有类型id
        HashMap<String, Object> certificateMap = mapperCustom.getTotal("");
        map.put("certificateMap",certificateMap);
        return map;
    }

    @Override
    public Map<String, Map<String, Object>> getCabinetWarn() {
        //TODO:补齐一下3中类型id
        Map<String, Map<String, Object>> map = new HashMap<>(3);
        // 消毒柜
        HashMap<String, Object> disinfectionCabinetMap = mapperCustom.getTotal("");
        map.put("disinfectionCabinetMap", disinfectionCabinetMap);
        // 留样柜
        HashMap<String, Object> sampleCabinetMap = mapperCustom.getTotal("");
        map.put("sampleCabinetMap", sampleCabinetMap);
        // 紫外灯
        HashMap<String, Object> lampMap = mapperCustom.getTotal("");
        map.put("lampMap",lampMap);
        return map;
    }
}
