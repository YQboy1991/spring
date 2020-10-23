package com.lbl.beanextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author: BaoLei Li
 * @date: 2020/10/22
 **/
@Component
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessorTest执行了");
		BeanDefinition userServiceImpl = beanFactory.getBeanDefinition("userServiceImpl");
		userServiceImpl.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}
}
