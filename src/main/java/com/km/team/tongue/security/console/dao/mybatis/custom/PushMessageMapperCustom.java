package com.km.team.tongue.security.console.dao.mybatis.custom;

import java.util.HashMap;
import java.util.List;

public interface PushMessageMapperCustom {

    /**
     * 统计告警信息
     * @param warnTypeId:告警类型id
     * @return
     */
    HashMap<String, Object> getTotal(String warnTypeId);

    HashMap<String, Object> getTotalByListKey(List<String> listId);
}