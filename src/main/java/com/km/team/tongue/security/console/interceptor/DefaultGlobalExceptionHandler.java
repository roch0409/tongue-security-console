package com.km.team.tongue.security.console.interceptor;

import com.km.team.tongue.security.console.beans.vo.ResponseData;
import com.km.team.tongue.security.console.enums.ResultEnum;
import com.km.team.tongue.security.console.exception.SystemErrorException;
import com.km.team.tongue.security.console.exception.SystemWarnException;
import com.km.team.tongue.security.console.utils.ResponseDataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午2:32
 * Description: 全局异常处理
 */
@ControllerAdvice
public class DefaultGlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(DefaultGlobalExceptionHandler.class);

//    @Autowired
//    private ExceptionPoolExecutorUtils exceptionPoolAExecutor;

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseData handle(Exception exception) {
        if (exception instanceof SystemErrorException) {
            // 系统严重异常
            SystemErrorException errorException = (SystemErrorException) exception;
            logger.error("系统发生严重异常！异常类：[" + errorException.toString() +"], 异常信息:"+ exception.getCause());
            // 创建线程异步，异常池处理逻辑
//            ThreadPoolExecutorSingleton.getInstance().execute(()->{
//                exceptionPoolAExecutor.push2ExceptionMap(errorException);
//            });
        } else if (exception instanceof SystemWarnException) {
            // 业务异常
            SystemWarnException warnException = (SystemWarnException) exception;
            logger.error("系统发生异常！异常类：[" + warnException.toString() +"], 异常信息:"+ exception.getCause());
        }else {
            // 其余类型异常
            logger.error("系统发生未知类型异常！异常类：[{}], 异常信息:{}", exception.getClass(), exception);
        }
        return ResponseDataUtil.buildError(ResultEnum.ERROR);

    }
}
