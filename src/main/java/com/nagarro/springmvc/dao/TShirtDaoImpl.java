package com.nagarro.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.nagarro.springmvc.domain.TShirt;
import com.nagarro.springmvc.util.HibernateUtil;

@Repository
public class TShirtDaoImpl implements TShirtDao {

	public List<TShirt> getAllTShirts() {
		final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		final Session session = sessionFactory.openSession();
		final List<TShirt> tShirts = session.createQuery("from TShirt  ", TShirt.class).list();
		session.close();
		return tShirts;
	}
}
