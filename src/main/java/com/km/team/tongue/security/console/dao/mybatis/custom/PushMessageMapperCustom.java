package com.km.team.tongue.security.console.dao.mybatis.custom;

import java.util.HashMap;

public interface PushMessageMapperCustom {

    /**
     * 统计告警信息
     * @param warnTypeId:告警类型id
     * @return
     */
    HashMap<String, Object> getTotal(String warnTypeId);
}