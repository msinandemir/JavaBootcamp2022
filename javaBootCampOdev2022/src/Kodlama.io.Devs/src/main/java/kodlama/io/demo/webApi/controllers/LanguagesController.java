package kodlama.io.demo.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.demo.entites.concretes.Language;
import kodlama.io.demo.service.concretes.LanguageServiceImpl;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	@Autowired
	LanguageServiceImpl service;

	@GetMapping
	public List<Language> getAllLanguages() {
		return service.getAll();
	}

	@PostMapping
	public Language saveLanguage(@RequestBody Language newLanguage) {
		return service.add(newLanguage);
	}

	@PutMapping("/{languageId}")
	public Language updateLanguage(@RequestBody Language newLanguage, @PathVariable int languageId) {
		return service.update(newLanguage, languageId);
	}

	@DeleteMapping("/{languageId}")
	public void deleteLanguage(@PathVariable int languageId) {
		service.delete(languageId);
	}
	
	@GetMapping("/{languageId}")
	public Language findById(@PathVariable int languageId) {
		return service.findById(languageId);
	}

}
