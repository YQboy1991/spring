package com.lbl.beanextend;

import com.lbl.beanextend.service.IUserService;
import com.lbl.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
public class MainTest {

	/**
	 * 调用顺序
	 *
	 * BeanFactoryPostProcessorTest执行了
	 *
	 * 构造方法
	 * Before init方法的后置处理器
	 * Before init方法的后置处理器1
	 * init方法
	 * After init方法的后置处理器
	 * After init方法的后置处理器1
	 * 构造方法
	 * Before init方法的后置处理器
	 * Before init方法的后置处理器1
	 * init方法
	 * After init方法的后置处理器
	 * After init方法的后置处理器1
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		IUserService userService = annotationConfigApplicationContext.getBean(IUserService.class);
		IUserService userService1 = annotationConfigApplicationContext.getBean(IUserService.class);
		System.out.println(userService.hashCode() + "=========" + userService1.hashCode());
	}
}
