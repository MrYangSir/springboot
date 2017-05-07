package com.heasy.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/6.
 * 使用功能类bean
 */
@Service
public class UserFunService {
    @Autowired//注入FunService这个对象
    private FunService funService;

    public String SayHello(String word) {
        return funService.sayHello(word);
    }
}
