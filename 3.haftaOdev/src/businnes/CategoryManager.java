package businnes;

import java.util.List;

import dataAccess.ICategoryDao;
import entites.Category;
import logging.ILogger;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private List<ILogger> loggers;//Birden fazla loglama yapmak için list kullandık.
	public CategoryManager(ICategoryDao categoryDao,List<ILogger> logs) {
		this.categoryDao = categoryDao;
		this.loggers=logs;
	}
	
	public void add(Category category) throws Exception {
		List<Category> categorys=categoryDao.getAllCategory();//Tüm kategorileri listeye çektik
		//Şimdi parametre olarak verilen kategori ismi ile listedeki kategorileri karşılaştıracağız.Eğer daha önce eklenmişse hata versin.
		for(Category kategoriler:categorys) {
			if(category.getCategoryName()==kategoriler.getCategoryName()) {
				throw new Exception("Bu kategori daha önce eklenmiş");
			}
		}
		categoryDao.add(category);//category.Dao her iki sınıfında referansını tuttuğu için onun add metodunu çağırıyoruz.
		//Bize hangi sınıf parametre geçilirse onun add metodunu kullanmış oluyoruz. Parametre geçilen sınıf da kendi içindeki add metoduyla kendi içindeki listeye ekleme yapıyor.
		//System.out.println("Eklenen kategori:"+ category.getCategoryName()+ " *** Ekleyen:"+categoryDao.toString());
		for (ILogger log : loggers) {
			log.log(category.getCategoryName());
		}
		
		
	}
}
