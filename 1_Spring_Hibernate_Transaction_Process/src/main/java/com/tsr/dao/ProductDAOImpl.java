package com.tsr.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.tsr.model.Product;

public class ProductDAOImpl {

	private Session session;

    public ProductDAOImpl(Session session) {
        this.session = session;
    }
    
	public void save(Product p) throws HibernateException{
		session.persist(p);
//		if(true) {
//			throw new NullPointerException();
//		}
	}

	public List<Product> list() {
		List<Product> productList = session.createQuery("from Product").list();
		return productList;
	}

}
