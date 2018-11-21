package com.mtag.addressbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mtag.addressbook.dao.ContactsDAO;
import com.mtag.addressbook.entity.Contacts;

@Service
public class ContactsServiceImp implements ContactsService {

	@Autowired
	private ContactsDAO contactsDAO;

	@Override
	@Transactional
	public List<Contacts> getContacts() {

		return contactsDAO.getContacts();
	}

	@Override
	@Transactional
	public void saveContact(Contacts theContacts) {
		contactsDAO.saveContact(theContacts);

	}

	@Override
	@Transactional
	public Contacts getContact(int theId) {

		return contactsDAO.getContact(theId);
	}

	@Override
	@Transactional
	public void deleteContact(int theId) {
		
		contactsDAO.deleteContact(theId);
		
	}

}
