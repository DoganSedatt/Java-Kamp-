package dataAccess;

import java.util.List;

import entites.Category;

public interface ICategoryDao {

	List<Category> getAllCategory();
	void add(Category category);
}
