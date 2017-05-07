package com.heasy.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/
 * 单例
 */
@Service
@Scope("singleton")//单例，默认为单例
public class DemoSingleService {

}
