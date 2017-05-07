package com.heasy.spring4.ch2.profile;

/**
 * Created by heasy on 2017/5/7.
 * 创建一个bean
 */
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
