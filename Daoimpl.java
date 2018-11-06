package com.agilcrm.dao;

import com.agilcrm.model.Contact;
import com.agilcrm.utility.Daoutilityclass;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
public class Daoimpl implements daointerface{
	public boolean create(Contact contact) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			java.sql.Connection connection=Daoutilityclass.getConnection();
			String query="insert into contacts_new(firstName,lastName,email) values(?,?,?)";
			java.sql.PreparedStatement ps;
			ps=connection.prepareStatement(query);
			ps.setString(1, contact.getFname());
			ps.setString(2, contact.getLname());				
			ps.setString(3, contact.getMail());				
			i=ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i>0;
	}

	public boolean update(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Contact byid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact byfirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact bylastname(String Lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact byemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
