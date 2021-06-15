package com.ibeetl.admin.core.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:define.properties")//加载配置文件，一次加载会放入内存
public class DefineConfig {

    @Value("${my.define.config1}")
    public String config1;
}
