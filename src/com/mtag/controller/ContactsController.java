package com.mtag.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mtag.addressbook.entity.Contacts;
import com.mtag.addressbook.service.ContactsService;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

	@Autowired
	private ContactsService contactsService;

	@GetMapping("/list")
	public String listContacts(Model theModel) {

		List<Contacts> theContacts = contactsService.getContacts();
		theModel.addAttribute("contacts", theContacts);
		return "contacts_list";

	}

	@GetMapping("/showContactsForm")
	public String showContactsForm(Model theModel) {

		Contacts theContacts = new Contacts();
		theModel.addAttribute("contacts", theContacts);
		return "contact_form";
	}

	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute("contacts") Contacts theContact) {

		contactsService.saveContact(theContact);
		return "redirect:/contacts/list";

	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("contactId") int theId, Model theModel) {

		Contacts theContacts = contactsService.getContact(theId);
		theModel.addAttribute(theContacts);
		return "contact_form";
	}

	@GetMapping("/deleteContact")
	public String deleteContact(@RequestParam("contactId") int theId) {

		contactsService.deleteContact(theId);
		return "redirect:/contacts/list";

	}

}
