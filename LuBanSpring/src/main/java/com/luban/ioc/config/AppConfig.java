package com.luban.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luban.*")
//@EnableLuBan
//@Import(MyImportBeanDefinitionRegister.class)
public class AppConfig {
}