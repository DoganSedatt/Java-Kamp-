package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entites.Category;

public class JdbcCategoryDao implements ICategoryDao{
	

	List<Category> kategoriler=new ArrayList<>();
	@Override
	public List<Category> getAllCategory() {
		for(Category categorys:kategoriler) {
			System.out.println("Kategoriler:"+ categorys.getCategoryName());
		}
		return kategoriler;
	}

	@Override
	public void add(Category category) {
		kategoriler.add(category);//Kategoriyi listeye ekle.
		System.out.println(category.getCategoryName()+" JDBC ile veritabanına eklendi");
	}

}
