package com.mtag.addressbook.service;

import java.util.List;

import com.mtag.addressbook.entity.Addresses;


public interface AddressesService {
	public void saveAddress(Addresses theAddresses);
	
	public Addresses getAddress(int theId);
	
	public List<Addresses> getAddresses();

}
