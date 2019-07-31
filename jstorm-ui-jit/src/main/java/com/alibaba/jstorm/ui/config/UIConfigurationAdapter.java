package com.alibaba.jstorm.ui.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zanhonglei
 * @description：
 * @date 2019 2019/7/31 13:15
 * @version:
 * @modified By：
 */
@Configuration
public class UIConfigurationAdapter extends WebMvcConfigurerAdapter {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("assets/**")
                .addResourceLocations("assets/");
    }
}
