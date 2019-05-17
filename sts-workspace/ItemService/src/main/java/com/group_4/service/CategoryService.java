package com.group_4.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.group_4.modal.Category;

public interface CategoryService {
	
 Category save(Category category);
 List<Category> fetchAllCategory();
 Category fetchCategory(Category category);
 Category updateCategory(Category category);
 void deleteCategory(Category category);

}
