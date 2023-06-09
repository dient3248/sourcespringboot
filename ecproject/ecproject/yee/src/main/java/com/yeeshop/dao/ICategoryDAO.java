package com.yeeshop.dao;

import java.util.List;

import com.yeeshop.entity.Category;

public interface ICategoryDAO {
    List<Category> findAll();
    Category findById(Integer id);
    boolean findExistCate(Category c);
    Category create(Category category);

	void update(Category category);

	Category delete(Integer id);

    


}