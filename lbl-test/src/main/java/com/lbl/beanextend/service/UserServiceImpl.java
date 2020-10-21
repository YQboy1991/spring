package com.lbl.beanextend.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
@Service
public class UserServiceImpl implements IUserService, InitializingBean {

	public UserServiceImpl(){
		System.out.println("构造方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init方法");
	}

//	@PostConstruct
//	public void postConstruct(){
//		System.out.println("postConstruct");
//	}
}
