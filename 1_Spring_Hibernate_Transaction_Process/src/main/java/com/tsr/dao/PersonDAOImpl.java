package com.tsr.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.tsr.model.Person;

public class PersonDAOImpl {

	private Session session;

    public PersonDAOImpl(Session session) {
        this.session = session;
    }
    
	public void save(Person p) throws HibernateException{
		session.persist(p);
	}

	public List<Person> list() {
		List<Person> personList = session.createQuery("from Person").list();
		return personList;
	}

}
