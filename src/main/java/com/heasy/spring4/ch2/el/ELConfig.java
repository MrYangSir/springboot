package com.heasy.spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by heasy on 2017/5/7.
 */
@Configuration
@ComponentScan("com.heasy.spring4.ch2.el")
@PropertySource("classpath:test.properties")
//注入配置文件是需要指定文件地址，如果使用@value,需要配置PropertySourcesPlaceholderConfigurer
//@PropertySources({
//        @PropertySource("classpath:config.properties"),
//        @PropertySource("classpath:db.properties")
//})加载多个个配置文件

public class ELConfig {

    @Value("I Love You!")//注入普通字符
    private String normal;
//
    @Value("#{systemProperties['os.name']}")//注入操作系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")//注入表达式后的结果
    private double randowNumber;
//
    @Value("#{demoService.auother}")//注入其他bean属性
    private String fromAuother;

    @Value("classpath:test.txt")//输入文件资源
    private Resource testFile;

    @Value("http://www.baidu.com")//注入网址
    private Resource testUrl;

    @Value("${book.author}")//注入配置文件
    private String auther;


    @Autowired
    private Environment environment;//注入properties文件可以从environment中取值


    @Bean//注入配置文件是需要指定文件地址，如果使用@value,需要配置PropertySourcesPlaceholderConfigurer
    public static PropertySourcesPlaceholderConfigurer properttySourcePlanceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randowNumber);
            System.out.println(fromAuother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(auther);
            System.out.println(environment.getProperty("book.name"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
