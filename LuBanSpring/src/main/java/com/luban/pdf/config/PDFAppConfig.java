package com.luban.pdf.config;

import com.luban.aop.dao.OrderTabDaoBImpl;
import com.luban.ioc.import1.MyImportBeanDefinitionRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.luban.pdf")
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
//@EnableLuBan
public class PDFAppConfig {

}
