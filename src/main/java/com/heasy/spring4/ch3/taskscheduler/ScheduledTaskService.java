package com.heasy.spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by heasy on 2017/5/18.
 * 计划任务执行类
 */
@Service
public class ScheduledTaskService {
    private  static  final SimpleDateFormat dataFormat= new SimpleDateFormat("HH:mm:ss")
            ;

    @Scheduled(fixedRate = 5000)
    public void  reportCurrentTime()
    {
        System.out.println("每五秒执行一次："+dataFormat.format(new Date()));
    }

    @Scheduled(cron = "2 * * * * ? ")
    public  void  fixTimeExecution(){
        System.out.println("在指定时间执行："+dataFormat.format(new Date())+"执行");
    }
}
