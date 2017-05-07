package com.heasy.spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/7.
 * 创建需要测试注入的bean
 */
@Service
public class DemoService
{
    @Value("其他类的属性")//注入普通字符串
    private String auother;

    public String getAuother() {
        return auother;
    }

    public void setAuother(String auother) {
        this.auother = auother;
    }
}
