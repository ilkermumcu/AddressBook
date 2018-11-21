package com.mtag.addressbook.dao;

import java.util.List;

import com.mtag.addressbook.entity.Addresses;
import com.mtag.addressbook.entity.Contacts;


public interface AddressesDAO {
	public void saveAddress(Addresses theAddresses);
	
	public Addresses getAddress(int theId);
	
	public List<Addresses> getAddresses();

}
