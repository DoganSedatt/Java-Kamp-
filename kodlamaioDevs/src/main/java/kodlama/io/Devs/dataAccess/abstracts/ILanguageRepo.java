package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ILanguageRepo {
	
	 void add(ProgrammingLanguage programmingLanguage);
	 void delete(int id);
	 void update(ProgrammingLanguage programmingLanguage,ProgrammingLanguage programmingLanguage2);
	 List<ProgrammingLanguage> getAll();
	 ProgrammingLanguage getById(int id);
}
