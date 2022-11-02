package kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.businness.abstracts.IProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageControllers {
	
	private IProgrammingLanguageService iProgrammingLanguageService;

	@Autowired
	public ProgrammingLanguageControllers(IProgrammingLanguageService iProgrammingLanguageService) {
		this.iProgrammingLanguageService = iProgrammingLanguageService;
	}
	
	@GetMapping("/add")
	public void add(@RequestParam ProgrammingLanguage programmingLanguage) {
		iProgrammingLanguageService.add(programmingLanguage);
		
	}
	@GetMapping("/delete")
	public void delete(int id) {
		iProgrammingLanguageService.delete(id);
	}
	
	@GetMapping("/update")
	public void update(ProgrammingLanguage programmingLanguageCurrent,ProgrammingLanguage programmingLanguageNew) {
		iProgrammingLanguageService.update(programmingLanguageCurrent, programmingLanguageNew);
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return iProgrammingLanguageService.getAll();
	}
	
	@GetMapping("/getbyid/{id}")
	ProgrammingLanguage byId(@PathVariable int id) {
		return iProgrammingLanguageService.getById(id);
	}
	
}
