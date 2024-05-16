package test;

import org.hibernate.Session;

import dao.HibernateUtil;

public class TestHBM {

	public static void main(String[] args) {

			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.clear();
			System.out.println("OK");
	}

}
