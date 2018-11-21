package com.mtag.addressbook.dao;

import java.util.List;

import com.mtag.addressbook.entity.Contacts;

public interface ContactsDAO {
	
	public List<Contacts> getContacts();

	public void saveContact(Contacts theContacts);

	public Contacts getContact(int theId);

	public void deleteContact(int theId);

}
