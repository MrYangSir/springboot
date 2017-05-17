package com.heasy.spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by heasy on 2017/5/18.
 */
@Configuration
@ComponentScan("com.heasy.spring4.ch3.taskscheduler")
@EnableScheduling//开启计划任务的支持
public class TaskSchedulerConfig {
}
