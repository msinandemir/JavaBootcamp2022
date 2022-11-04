package kodlama.io.demo.service.abstracts;

import java.util.List;

import kodlama.io.demo.service.dto.requests.CreateLanguageRequest;
import kodlama.io.demo.service.dto.requests.UpdateLanguageRequest;
import kodlama.io.demo.service.dto.responses.FindByIdLanguageResponse;
import kodlama.io.demo.service.dto.responses.GetLanguageResponse;
import kodlama.io.demo.service.dto.responses.UpdateLanguageResponse;

public interface LanguageService {
	List<GetLanguageResponse> getAll();
	CreateLanguageRequest add(CreateLanguageRequest newLanguage);
	UpdateLanguageResponse update(int id, UpdateLanguageRequest newLanguage);
	void delete(int id);
	FindByIdLanguageResponse findById(int languageById);

}
