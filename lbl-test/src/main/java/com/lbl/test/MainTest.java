package com.lbl.test;

import com.lbl.test.module.User;
import com.lbl.test.service.UserService;
import com.lbl.test.service.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
public class MainTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(UserServiceImpl.class);
		UserService bean = annotationConfigApplicationContext.getBean(UserServiceImpl.class);
		User user = bean.getUser();
		System.out.println(user.toString());
	}
}
