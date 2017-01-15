package com.jdbc.DAO;

import java.util.List;

import com.jdbc.DTO.Category;
public interface CategoryDAO {
	
  public List<Category> getAllCategories() throws Exception;
  public int deleteCategory(int id) throws Exception;
}
