package com.id.eta.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.id.eta.entity.Users;

@Repository
public class UsersDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Users> getAllUser() {
		String hsql = "from users";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hsql);

		return query.list();
	}
}