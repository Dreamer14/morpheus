package com.user.connections;

import java.sql.DriverManager;

public class Connection {


	     public static java.sql.Connection conn=null;
		
	     public static java.sql.Connection getConnection(){
	    	 
	    	 try {
				
	    		  Class.forName("com.mssql.jdbc.Driver");
	    		  conn=DriverManager.getConnection("jdbc:sqlserver://morpheus.database.windows.net:1433;database=MorpheusDB;user=admMorpheus@morpheus;password=GuiGuy26;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
	    		  
	    		  System.out.println("Enter into Connection Part"+conn);
	    		  
	    	       } 
	    	 catch (Exception e) {
				
	            e.printStackTrace();
				
			}
	    	 
	    	 return conn;
	     }
	  }
