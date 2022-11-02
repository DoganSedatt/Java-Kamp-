package kodlama.io.Devs.dataAccess.concretes;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ILanguageRepo;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryLanguageRepo implements ILanguageRepo{
	
	List<ProgrammingLanguage> languageList;
	
	@Autowired
	public InMemoryLanguageRepo() {
		languageList=new ArrayList<>();//Constructor bize boş bir liste oluşturacak.
		languageList.add(new ProgrammingLanguage(1,"Java"));
		languageList.add(new ProgrammingLanguage(2,"C#"));
		languageList.add(new ProgrammingLanguage(3,"C"));
	}
	
	//Dil Ekleme
	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage languages : languageList) {
			if(languages.getName()==programmingLanguage.getName()) {
				System.out.println(programmingLanguage.getName()+" dili daha önce eklenmiş.");
			}
		}
		languageList.add(programmingLanguage);
	}
	
	//Dil silme
	@Override
	public void delete(int id) {
		for (ProgrammingLanguage programmingLanguage : languageList) {
			if(programmingLanguage.getId()==id) {
				languageList.remove(programmingLanguage);
			}
		}
		
	}
	
	//Dili güncelleme
	@Override
	public void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage programmingLanguage2) {
		//İlk parametre mecvut dili,ikinci parametre mevcut dilin güncellenmiş halini temsil ediyor.
		for (ProgrammingLanguage programmingLanguageList : languageList) {
			//Listeyi dolaş ve değişkene at.
			if(programmingLanguage.getName()==programmingLanguageList.getName()) {
				//Eğer parametre verilen dilin adı değişken listede tutulan dil adı ile aynı ise yani dil mevcutsa
				programmingLanguageList.setName(programmingLanguage2.getName());
				//Listedeki dilin adını ikinci paramtrede verilen dil adı ile değiştir.
			}
		}
		
	}
	
	
	//Dilleri listeleme
	@Override
	public List<ProgrammingLanguage> getAll() {
		for (ProgrammingLanguage programmingLanguage : languageList) {
			System.out.println(programmingLanguage.getId()+"-"+programmingLanguage.getName());
		}
		return languageList;
	}
	
	//Dilleri id'sine göre getirme
	@Override
	public ProgrammingLanguage getById(int id) {
		for (ProgrammingLanguage programmingLanguage : languageList) {
			if(id==programmingLanguage.getId()) {
				//System.out.println("Verilen id="+ id + " Buna karşılık gelen dil="+ programmingLanguage.getName());
				return programmingLanguage;
			}
		}
		return null;
	}
}
