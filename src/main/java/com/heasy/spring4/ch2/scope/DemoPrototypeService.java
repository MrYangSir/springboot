package com.heasy.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by heasy on 2017/5/7.
 * 多例
 */
@Service
@Scope("prototype")//多例
public class DemoPrototypeService {
}
