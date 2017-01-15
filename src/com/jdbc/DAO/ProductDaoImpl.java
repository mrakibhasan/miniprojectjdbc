package com.jdbc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.DTO.Product;
import com.jdbc.util.DBConnection;

public class ProductDaoImpl implements ProductDAO{
	DBConnection connection=new DBConnection();
	Connection connect=null;
	@Override
	public List<Product> getAllProductByCategoryId(int id) throws Exception{
		
		List<Product> result=new ArrayList<Product>();
		String sql="select products.id,products.name,products.description from products,categories_products where categories_products.product_id=products.id && categories_products.category_id="+id;
		connect=connection.getConnection();
		Statement smt=null;
		smt=connect.createStatement();
		ResultSet  rs=smt.executeQuery(sql);
		while(rs.next()){
			
			Product product=new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setDescription(rs.getString(3));
			result.add(product);
			
		}
		connect.close();		
		return result;
	}

	@Override
	public int deleteProduct(int id) throws Exception {
		String sql= "delete from products  where id="+id;
		connect=connection.getConnection();
		Statement smt=connect.createStatement();
		int result=smt.executeUpdate(sql);
		
		connect.close();
		return result;
	}

	@Override
	public List<Product> getLargestDescription() throws Exception {
		
		List<Product> result=new ArrayList<Product>();
		String sql="SELECT * FROM products ORDER BY  CHAR_LENGTH(description) desc limit 1";
		connect=connection.getConnection();
		Statement smt=null;
		smt=connect.createStatement();
		ResultSet  rs=smt.executeQuery(sql);
		while(rs.next()){
			
			Product product=new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setDescription(rs.getString(3));
			result.add(product);
			
		}
		connect.close();		
		return result;
	}

	@Override
	public int RemoveProductfromaCategory(int id) throws Exception {
		
		String sql= "delete products from products,categories_products where categories_products.product_id=categories_products.category_id && products.id"+id;
		connect=connection.getConnection();
		Statement smt=connect.createStatement();
		int result=smt.executeUpdate(sql);
		
		connect.close();
		return result;
	}

	@Override
	public List<Product> DisplayRecent5Products() throws Exception {
		
		List<Product> result=new ArrayList<Product>();
		String sql= "select * from products order by id desc limit 5";
		connect=connection.getConnection();
		Statement smt=null;
		smt=connect.createStatement();
		ResultSet  rs=smt.executeQuery(sql);
		
		while(rs.next()){
			
			Product product=new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setDescription(rs.getString(3));
			result.add(product);
			
		}
		connect.close();		
		return result;
	}

	@Override
	public double getAvgNumberPorductsofAllCategory() throws Exception {
		
		String sql="select avg(p) from (select category_id, count( product_id ) as p FROM categories_products group by category_id )as tb "; 
		connect=connection.getConnection();
		Statement st=connect.createStatement();
		ResultSet rs=st.executeQuery(sql);
		double avg = 0;
		while(rs.next()){
			avg=rs.getFloat(1);
		}
		return avg;
	}

}
