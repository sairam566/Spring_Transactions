package com.tsr.service;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tsr.dao.PersonDAOImpl;
import com.tsr.dao.ProductDAOImpl;
import com.tsr.model.Person;
import com.tsr.model.Product;

public class RegistrationService {
	
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public void regPersonPrduct(Product product,Person person)  {
    	Session session = null;
    	Transaction tx = null;
    	PersonDAOImpl personDAO = null;
    	ProductDAOImpl productDAO = null;
    	try {
    		session = this.sessionFactory.openSession();
    		tx = session.beginTransaction();
    		personDAO = new PersonDAOImpl(session);
    		productDAO = new ProductDAOImpl(session);
    		
    		personDAO.save(person);
    		productDAO.save(product);
    		tx.commit();
		} catch (HibernateException | NullPointerException e) {
			if(tx!=null) {
				tx.rollback();
			}
			throw e;
		}finally {
			if(session!=null) {
				session.close();
			}
		}
    }
}
