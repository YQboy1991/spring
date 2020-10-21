package com.lbl.test;

import com.lbl.test.Module.User;
import com.lbl.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
		User user = bean.getUser();
		System.out.println(user.toString());
	}
}
