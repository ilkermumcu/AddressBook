package com.mtag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mtag.addressbook.entity.Addresses;
import com.mtag.addressbook.entity.Contacts;
import com.mtag.addressbook.service.AddressesService;


@Controller
@RequestMapping("/addresses")
public class AddressesController {
	
	@Autowired
	private AddressesService addressesService;


	@GetMapping("/ContactForAddresses")
	public String ContactForAddresses(@ModelAttribute("addresses") Addresses theAddresses) {
		//addressesService.saveAddress(theAddresses);
		return "address_form";
		
		

	}
	
	@PostMapping("/updateAddress")
	public String updateAddress(@ModelAttribute("addresses") Addresses theAddresses) {
		addressesService.saveAddress(theAddresses);
		return "address_list";
		
		
		
	}
	
	
	
	
	
}
