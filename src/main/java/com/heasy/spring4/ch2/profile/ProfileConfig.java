package com.heasy.spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by heasy on 2017/5/7.
 */
@Configuration
@ComponentScan("com.heasy.spring4.ch2.profile")
public class ProfileConfig {
    @Bean
    @Profile("dev")//
    public DemoBean devDemoBean() {
        return new DemoBean("from developmetn profile");
    }

    @Bean
    @Profile("prod")
    public  DemoBean prodDemoBean()
    {
        return  new DemoBean("from production profile");
    }
}
