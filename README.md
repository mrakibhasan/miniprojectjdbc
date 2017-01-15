# miniprojectjdbc

This is simple jdbc project which maintain products and category information.
This project contains source folder under five packages:

	com.jdbc.util
		-Database connection class
		
	com.jdbc.DTO
	   -All Model classes
	    
	com.jdbc.DAO
		-All operation that are directly updated to database. Here DAO classes 
		contains interface to be implemented and DaoImpl classes are actual
		implementation of interfaces
		
	com.jdbc.BO
		-All classes in this folder return the result from the com.jdbc.DAO 		package. Here two java files one is control the product and another is 		maintain the category
	
	com.jdbc.view
		-This is the java file that responsible to show the result in the 		console
		
		End