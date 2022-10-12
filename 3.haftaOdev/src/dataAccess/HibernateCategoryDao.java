package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entites.Category;

public class HibernateCategoryDao implements ICategoryDao {
	
	List<Category> kategoriler=new ArrayList<>();
	@Override
	public List<Category> getAllCategory() {
		for(Category categorys:kategoriler) {
			//System.out.println("Kategoriler:"+ categorys.getCategoryName());
		}
		return kategoriler;
	}

	@Override
	public void add(Category category) {
		kategoriler.add(category);
		System.out.println(category.getCategoryName()+" Hibernate ile veritabanına eklendi");
	}

	@Override
	public String toString() {
		return "Hibernate";
	}
	

}
