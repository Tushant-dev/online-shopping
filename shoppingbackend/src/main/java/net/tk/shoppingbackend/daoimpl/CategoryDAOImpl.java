package net.tk.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.tk.shoppingbackend.dao.CategoryDAO;
import net.tk.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		category.setId(1);
		category.setName("Mobile");
		category.setDescripation("This is Apple Mobile");
		category.setImgurl("mob.png");

		categories.add(category);

		category = new Category();

		category.setId(2);
		category.setName("Telivison");
		category.setDescripation("This is MI TV");
		category.setImgurl("tv.png");

		categories.add(category);

		category = new Category();

		category.setId(3);
		category.setName("Fan");
		category.setDescripation("This is Orient Fan");
		category.setImgurl("fan.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories)
		{
			if(category.getId()==id) return category;
		}
		
		return null;
	}

}
