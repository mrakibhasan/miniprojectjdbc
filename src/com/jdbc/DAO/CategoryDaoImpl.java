package com.jdbc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.DTO.Category;
import com.jdbc.util.DBConnection;

public class CategoryDaoImpl implements CategoryDAO{
  
	DBConnection connection=new DBConnection();
	Connection connect=null;
	
	@Override
	public List<Category> getAllCategories() throws Exception {
		List <Category> allCat=new ArrayList<Category>();
		
		String sql="select id, name from categories";
		connect=connection.getConnection();
		Statement smt=connect.createStatement();
		ResultSet  rs=smt.executeQuery(sql);
		while (rs.next()){
			Category category=new Category();
			category.setId(rs.getInt("id"));
			category.setName(rs.getString("name"));
			allCat.add(category);
		}
		connect.close();
		return allCat;
	}

	@Override
	public int deleteCategory(int id) throws Exception{
		String sql= "delete from categories  where id="+id;
		connect=connection.getConnection();
		Statement smt=connect.createStatement();
		int result=smt.executeUpdate(sql);		
		connect.close();
		return result;
	}

	
	
	

}
