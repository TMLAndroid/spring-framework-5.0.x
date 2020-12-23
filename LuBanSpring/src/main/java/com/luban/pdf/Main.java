package com.luban.pdf;

import com.luban.ioc.config.AppConfig;
import com.luban.ioc.dao.Dao1;
import com.luban.pdf.config.PDFAppConfig;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	//main 生成 快捷键 psvm
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(PDFAppConfig.class);
	}
}
