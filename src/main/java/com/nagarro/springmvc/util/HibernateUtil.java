package com.nagarro.springmvc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static volatile SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			synchronized (SessionFactory.class) {
				if (sessionFactory == null) {
					sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				}
			}
		}
		return sessionFactory;
	}
}
