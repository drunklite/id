package com.id.eta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.id.eta.dao.UsersDAO;

@Service
public class UserService {
	@Autowired
	private UsersDAO userDao;

	public int userCount() {
		return userDao.getAllUser().size();
	}

}