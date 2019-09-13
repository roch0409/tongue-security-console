package com.km.team.tongue.security.console.controller.base;


import com.km.team.tongue.security.console.service.ICameraService;
import com.km.team.tongue.security.console.service.IMessageService;
import com.km.team.tongue.security.console.service.IOrgService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: jiangjun
 * Date: 2018/9/11
 * Time: 下午2:27
 * Description:
 */
@Component
public class ServiceContainer {

    @Resource
    protected ICameraService cameraService;

    @Resource
    protected IOrgService orgService;

    @Resource
    protected IMessageService messageService;

}