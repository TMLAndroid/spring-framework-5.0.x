package com.luban.ioc;

import com.luban.ioc.config.AppConfig;
import com.luban.ioc.dao.IndexDao;
import com.luban.ioc.dao.java8.DaoInter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	//main 生成 快捷键 psvm
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
//		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyConfigurationClassPostProcessor());
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.query();
		DaoInter daoInter = annotationConfigApplicationContext.getBean(DaoInter.class);
		daoInter.ha();


//		Dao1 dao1 = (Dao1) annotationConfigApplicationContext.getBean("cardDao");
//		dao1.list();

//		Dao2Impl dao2 = (Dao2Impl) annotationConfigApplicationContext.getBean("Dao2Impl");
//		dao2.query();


	}
}
