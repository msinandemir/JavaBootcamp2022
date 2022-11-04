package kodlama.io.demo.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.demo.service.concretes.LanguageServiceImpl;
import kodlama.io.demo.service.dto.requests.CreateLanguageRequest;
import kodlama.io.demo.service.dto.requests.UpdateLanguageRequest;
import kodlama.io.demo.service.dto.responses.FindByIdLanguageResponse;
import kodlama.io.demo.service.dto.responses.GetLanguageResponse;
import kodlama.io.demo.service.dto.responses.UpdateLanguageResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private final LanguageServiceImpl service;

	@GetMapping
	public List<GetLanguageResponse> getAllLanguages() {
		return service.getAll();
	}

	@PostMapping
	public CreateLanguageRequest saveLanguage(@RequestBody CreateLanguageRequest newLanguage) {
		return service.add(newLanguage);
	}

	@PutMapping("/{languageId}")
	public UpdateLanguageResponse updateLanguage(@RequestBody UpdateLanguageRequest newLanguage, @PathVariable int languageId) {
		return service.update(languageId, newLanguage);
	}

	@DeleteMapping("/{languageId}")
	public void deleteLanguage(@PathVariable int languageId) {
		service.delete(languageId);
	}
	
	@GetMapping("/{languageId}")
	public FindByIdLanguageResponse findById(@PathVariable int languageId) {
		return service.findById(languageId);
	}

}
