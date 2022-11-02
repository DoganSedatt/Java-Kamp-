package kodlama.io.Devs.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.businness.abstracts.IProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ILanguageRepo;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements IProgrammingLanguageService{
	
	
	private ILanguageRepo languageRepo;
	
	@Autowired
	public ProgrammingLanguageManager(ILanguageRepo languageRepo) {
		this.languageRepo = languageRepo;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languageRepo.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		languageRepo.delete(id);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage programmingLanguage2) {
		languageRepo.update(programmingLanguage, programmingLanguage2);
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepo.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepo.getById(id);
	}

}
