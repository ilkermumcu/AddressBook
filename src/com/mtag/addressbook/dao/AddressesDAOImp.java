package com.mtag.addressbook.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mtag.addressbook.entity.Addresses;
import com.mtag.addressbook.entity.Contacts;

@Repository
public class AddressesDAOImp implements AddressesDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveAddress(Addresses theAddresses) {
		Session currentSession =sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theAddresses);
		
	}

	@Override
	public Addresses getAddress(int theId) {
       Session currentSession =sessionFactory.getCurrentSession();
       Addresses theAddresses = currentSession.get(Addresses.class,theId);
		return theAddresses;
	}

	@Override
	public List<Addresses> getAddresses() {
		Session currentSession =sessionFactory.getCurrentSession();
		Query<Addresses> theQuery =currentSession.createQuery("from Addresses where contactId is not null",Addresses.class);
		List<Addresses> addresses = theQuery.getResultList();

		return addresses;
		       
	}

	@Override
	public void deleteAddress(int theId) {
		Session currentSession =sessionFactory.getCurrentSession();
		Query theQuery =currentSession.createQuery("delete from Addresses where id=:addressId");
		theQuery.setParameter("addressId", theId);
		theQuery.executeUpdate();
		
	}
	
}
