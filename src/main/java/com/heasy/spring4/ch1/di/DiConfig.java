package com.heasy.spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by heasy on 2017/5/6.
 * 配置类，
 */
@Configuration//声明这是一个配置类
@ComponentScan("package com.heasy.spring4.ch1.di")//扫描这目录下的所有文件
public class DiConfig {
}
