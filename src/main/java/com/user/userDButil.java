package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDButil {
	
	public static List<User> validate(String username,String email){
		
		ArrayList<User> us = new ArrayList<>();
		
		//create database connection

		 String url = "jdbc:mysql://localhost:3306/games";
		 String user = "root";
		 String password = "";
		
		 
		//validate
		
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
				
			Connection	con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			String sql = "select * from user where username='"+username+"' and email='"+email+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				int id = rs.getInt(1);
    			String userU = rs.getString(2);
    			String emailE = rs.getString(3);
    			String comment = rs.getString(4);
    			
    			
    			User u = new User(id,userU,emailE,comment);
    			us.add(u);
    		
			} 
			
		} 
		 catch (Exception e) {
				e.printStackTrace();
			}
		
		return us;
		
	}

}

