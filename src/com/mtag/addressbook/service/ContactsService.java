package com.mtag.addressbook.service;

import java.util.List;

import com.mtag.addressbook.entity.Contacts;

public interface ContactsService {
	
	public List<Contacts> getContacts();

	public void saveContact(Contacts theContacts);

	public Contacts getContact(int theId);

	public void deleteContact(int theId);
	

}
