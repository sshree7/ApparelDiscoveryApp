package com.nagarro.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.springmvc.dao.UserDao;
import com.nagarro.springmvc.domain.User;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	@Autowired
	private UserDao userDao;

	public boolean isValidUser(final String name, final String password) {
		final User user = userDao.getUser(name);
		return user != null && user.getPassword().equals(password);
	}
}
