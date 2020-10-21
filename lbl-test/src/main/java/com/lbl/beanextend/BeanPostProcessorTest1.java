package com.lbl.beanextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
@Component
public class BeanPostProcessorTest1 implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userServiceImpl"))
			System.out.println("Before init方法的后置处理器1");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userServiceImpl"))
			System.out.println("After init方法的后置处理器1");
		return bean;
	}

	@Override
	public int getOrder() {
		return 50;
	}
}
