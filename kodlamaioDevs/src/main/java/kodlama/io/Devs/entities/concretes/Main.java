package kodlama.io.Devs.entities.concretes;

import kodlama.io.Devs.dataAccess.abstracts.ILanguageRepo;
import kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepo;

public class Main {
	//Main sınıfını, yapılan işlemleri kontrol etmek için açtım.
	public static void main(String[] args) {
		ILanguageRepo languageRepo=new InMemoryLanguageRepo();
		//languageRepo.add(new ProgrammingLanguage(1,"C#"));
		System.out.println("Liste boyutu:"+ languageRepo.getAll().size());
		System.out.println( languageRepo.getById(1));
		languageRepo.update(new ProgrammingLanguage(1,"Java"), new ProgrammingLanguage(1,"C++"));
		//Java dili C++ olarak değiştirildi
		System.out.println(languageRepo.getAll());
	}

}
