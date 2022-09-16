package com.nagarro.springmvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import com.nagarro.springmvc.domain.User;
import com.nagarro.springmvc.util.HibernateUtil;

@Repository
public class UserDaoImpl implements UserDao {

	public User getUser(final String name) {

		final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		final Session session = sessionFactory.openSession();
		final Transaction transaction = session.beginTransaction();
		User currentUser = (User) session.get(User.class, name);		
		transaction.commit();
		session.close();
		return currentUser;
	}
}