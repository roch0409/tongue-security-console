package com.km.team.tongue.security.console.service;

import com.km.team.tongue.security.console.beans.pojo.Tcamera;

import java.util.List;
import java.util.Map;

/**
 * Author: jiangjun
 * Date: 2019/9/8
 * Time: 9:16 下午
 * Description:
 */
public interface ICameraService {

    Tcamera getDataById(String camId);

    /**
     * 实时在线、离线数量统计
     * @return
     */
    Map<String, Object> realTimeTotal();

    /**
     * 摄像头分类接入统计
     * @return
     */
    List<Map<String, Map<String, Object>>> categoryJoinTotal();

    /**
     * 上周新增接入数量
     * @return
     */
    int getLastWeekTotal();

    /**
     * 近一周新增摄像头
     * @return
     */
    Integer getWeekIncrTotal();
}
