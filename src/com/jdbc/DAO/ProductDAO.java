package com.jdbc.DAO;

import java.util.List;

import com.jdbc.DTO.Product;;

public interface ProductDAO {
	
	public List<Product> getAllProductByCategoryId(int id) throws Exception;
	public int deleteProduct(int id) throws Exception;
	public  List<Product> getLargestDescription() throws Exception;
	public int RemoveProductfromaCategory(int id) throws Exception;
	public List<Product> DisplayRecent5Products() throws Exception;
	public double getAvgNumberPorductsofAllCategory()throws Exception;

}
