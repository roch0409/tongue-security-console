package com.km.team.tongue.security.console.controller;

import com.km.team.tongue.security.console.beans.vo.ResponseData;
import com.km.team.tongue.security.console.controller.base.BaseController;
import com.km.team.tongue.security.console.utils.ResponseDataUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: jiangjun
 * Date: 2019/9/9
 * Time: 11:40 下午
 * Description:
 */
@RestController
@RequestMapping("org")
public class OrgController extends BaseController<CameraController> {

    /**
     * 共接入单位统计
     * @return
     */
    @GetMapping("total")
    public ResponseData getTotalStatistics() {
        return ResponseDataUtil.buildSuccess(orgService.getTotal());
    }

    /**
     * 实时单位接入统计（按单位的create_time来计算）
     * @return
     */
    @GetMapping("realTimeOrgJoin")
    public ResponseData getRealTimeOrgJoin() {
        return ResponseDataUtil.buildSuccess(orgService.getRealTimeOrgJoin());
    }

    /**
     * 各地市接入单位数量统计排行
     */
    @GetMapping("region")
    public ResponseData getRegionStatistics() {
        return ResponseDataUtil.buildSuccess(orgService.getRegionStatistics());

    }
}
