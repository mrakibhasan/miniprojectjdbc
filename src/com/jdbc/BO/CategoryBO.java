package com.jdbc.BO;

import java.util.List;

import com.jdbc.DAO.CategoryDaoImpl;
import com.jdbc.DTO.Category;

public class CategoryBO {
	CategoryDaoImpl cdImp=new CategoryDaoImpl();
	
	//Fetch all the category
	public List<Category> gellAllCategory() throws Exception {
		return cdImp.getAllCategories();
	}
	
	//delete certain category
	public int deletecategoryInfo(int id) throws Exception{
		return cdImp.deleteCategory(id);
	}

}
