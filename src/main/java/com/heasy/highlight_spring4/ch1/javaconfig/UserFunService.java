package com.heasy.highlight_spring4.ch1.javaconfig;

/**
 * Created by heasy on 2017/5/6.
 * 功能类
 */

public class UserFunService {
    FunService funService;

    public void setFunService(FunService funService) {
        this.funService = funService;
    }
    public  String SayHello(String word){
        return funService.sayHello(word);
    }
}
