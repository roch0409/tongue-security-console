package com.km.team.tongue.security.console.support;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: jiangjun
 * Date: 2018/9/10
 * Time: 下午2:39
 * Description: 线程池单例
 */
public class ThreadPoolExecutorSingleton {


    /**
     * 静态内部类的方式，初始化单例
     */
    private static class SingletonFactory{
        private static ThreadPoolExecutor instance;

        /**
         * 线程池初始化
         *
         * 初始化参数查看ThreadPoolExecutorTest类
         */
        static {
            instance = new ThreadPoolExecutor(10,30,1,
                    TimeUnit.SECONDS,new LinkedBlockingQueue<>(20));
            instance.allowCoreThreadTimeOut(true);
        }

        public static ThreadPoolExecutor getInstance(){
            return SingletonFactory.instance;
        }
    }

    public static ThreadPoolExecutor  getInstance(){
        return SingletonFactory.getInstance();
    }
}
