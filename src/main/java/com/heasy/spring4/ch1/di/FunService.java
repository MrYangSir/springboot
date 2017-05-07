package com.heasy.spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/6.
 * 编写功能类bean
 */
@Service
public class FunService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
