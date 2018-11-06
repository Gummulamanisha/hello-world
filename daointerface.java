package com.agilcrm.dao;

import com.agilcrm.model.Contact;

public interface daointerface {
	public boolean create(Contact contact);
	public boolean update(String email);
	public boolean delete(int id);
	public Contact byid(int id);
	public Contact byfirstname(String firstname);
	public Contact bylastname(String Lastname);
	public Contact byemail(String email);
}
