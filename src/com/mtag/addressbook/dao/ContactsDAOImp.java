package com.mtag.addressbook.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mtag.addressbook.entity.Contacts;

@Repository
public class ContactsDAOImp implements ContactsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Contacts> getContacts() {

		Session currentSession =sessionFactory.getCurrentSession();
		Query<Contacts> theQuery =currentSession.createQuery("from Contacts" , Contacts.class);
		List<Contacts> contacts = theQuery.getResultList();

		return contacts;
	}

	@Override
	public void saveContact(Contacts theContact) {
		
		Session currentSession =sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theContact);
	}

	@Override
	public Contacts getContact(int theId) {
		
		Session currentSession =sessionFactory.getCurrentSession();
		
		Contacts theContact = currentSession.get(Contacts.class,theId);
		return theContact;
	}

	@Override
	public void deleteContact(int theId) {
		
		Session currentSession =sessionFactory.getCurrentSession();
		Query theQuery =currentSession.createQuery("delete from Contacts where id=:contactId");
		theQuery.setParameter("contactId", theId);
		theQuery.executeUpdate();
	}

}
