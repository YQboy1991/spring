package com.lbl.test.service;

import com.lbl.test.module.User;

/**
 * @author: BaoLei Li
 * @date: 2020/10/21
 **/
//@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser() {
		User user = new User();
		user.setName("小李");
		user.setAge(18);
		return user;
	}
}
