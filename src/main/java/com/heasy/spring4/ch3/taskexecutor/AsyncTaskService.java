package com.heasy.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/17.
 * 任务执行类
 */
@Service
@Async
public class AsyncTaskService {
//    @Async //注释该方法是异步的。这个可以在类和方法两个上面使用
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

//    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步方法+1：" + i);
    }
}
