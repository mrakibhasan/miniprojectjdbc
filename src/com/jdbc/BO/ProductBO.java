package com.jdbc.BO;

import java.util.List;

import com.jdbc.DAO.ProductDaoImpl;
import com.jdbc.DTO.Product;

public class ProductBO {
	ProductDaoImpl pdimp=new ProductDaoImpl();
	
	public List<Product> getProductByCategory(int id) throws Exception{
		return pdimp.getAllProductByCategoryId( id);
		
	}
	
	public int deleteProductInfo(int id) throws Exception{
		return pdimp.deleteProduct(id);
		
	}
	public List<Product> getProductByLargestDescription() throws Exception{
		return pdimp.getLargestDescription();
		
	}
	public int deleteProductFromaCategory(int id) throws Exception{
		return pdimp.RemoveProductfromaCategory(id);
		
	}
	public List<Product> getRecentProducts() throws Exception{
		return pdimp.DisplayRecent5Products();
		
	}
	public double getAvgNumberofproducts() throws Exception{
		return pdimp.getAvgNumberPorductsofAllCategory();
	}
	

}
