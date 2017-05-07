package com.heasy.spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by heasy on 2017/5/6.
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunService funService() {
        return new FunService();
    }

    @Bean
    public UserFunService userFunService() {
        UserFunService userFunService = new UserFunService();
        userFunService.setFunService(funService());
        return userFunService;
    }
    @Bean
    public UserFunService userFunService(FunService funService){
        UserFunService userFunService = new UserFunService();
        userFunService.setFunService(funService);
        return userFunService;
    }
}
