package net.tk.shoppingbackend.dao;

import java.util.List;

import net.tk.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);

}
