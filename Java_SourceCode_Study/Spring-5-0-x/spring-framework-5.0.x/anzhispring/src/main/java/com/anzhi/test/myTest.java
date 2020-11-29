package com.anzhi.test;

import com.anzhi.appconfig.Appconfig;
import com.anzhi.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myTest {
	public static void main(String[] args) {
		//把 spring 所有的前提环境准备
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(Appconfig.class);

/*
		ctx.register(IndexDao.class);
		ctx.refresh();
*/
		IndexDao indexDao = ctx.getBean(IndexDao.class);
		indexDao.query();
	}
}
