package com.heasy.spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by heasy on 2017/5/7.
 * 事件发布类
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//用来发布事件

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));//使用publish方法发布
    }
}
