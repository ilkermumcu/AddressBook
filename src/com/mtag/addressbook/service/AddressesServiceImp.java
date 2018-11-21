package com.mtag.addressbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mtag.addressbook.dao.AddressesDAO;
import com.mtag.addressbook.entity.Addresses;

@Service
public class AddressesServiceImp implements AddressesService {
	
	@Autowired
	private AddressesDAO addressesDAO;

	@Override
	@Transactional
	public void saveAddress(Addresses theAddresses) {
		
		addressesDAO.saveAddress(theAddresses);

	}

	@Override
	@Transactional
	public Addresses getAddress(int theId) {
		
		return addressesDAO.getAddress(theId);
	}

	@Override
	public List<Addresses> getAddresses() {
		
		return addressesDAO.getAddresses();
	}

}
