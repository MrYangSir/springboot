package com.heasy.spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by heasy on 2017/5/7.
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {//指定监听的事件类型

    @Override
    public void onApplicationEvent(DemoEvent event) {//对消息进行接收处理
        String msg = event.getMsg();
        System.out.println("我(bean-demolistener)接收到bean-demoPublisher发布的消息" + msg);
    }
}
