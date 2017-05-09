package com.heasy.spring4.ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by heasy on 2017/5/10.
 * spring Aware
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {//获取bean和资源加载的服务
    private String beanName;
    private ResourceLoader loader;


    @Override
    public void setBeanName(String name) {
        this.beanName = name;//重写beanNameAware方法set
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;//重写ResourceLoaderAware中的set方法
    }

    public void outputResult() {
        System.out.println("Bean的名称为:" + beanName);
        Resource resourceLoader = loader.getResource("classpath:readme.txt");

        try {
            System.out.println("resourceLoader文件内容为：" + IOUtils.toString(resourceLoader.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
