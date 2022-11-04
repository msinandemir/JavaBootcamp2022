package kodlama.io.demo.service.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import kodlama.io.demo.entites.concretes.Language;
import kodlama.io.demo.repos.abstracts.LanguageRepository;
import kodlama.io.demo.service.abstracts.LanguageService;
import kodlama.io.demo.service.dto.requests.CreateLanguageRequest;
import kodlama.io.demo.service.dto.requests.UpdateLanguageRequest;
import kodlama.io.demo.service.dto.responses.FindByIdLanguageResponse;
import kodlama.io.demo.service.dto.responses.GetLanguageResponse;
import kodlama.io.demo.service.dto.responses.UpdateLanguageResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LanguageServiceImpl implements LanguageService {

	private final LanguageRepository languageRepos;
	private final ModelMapper modelMapper;

	@Override
	public List<GetLanguageResponse> getAll() {
		List<Language> languages = languageRepos.findAll().stream().map(i -> i).collect(Collectors.toList());
		List<GetLanguageResponse> languagesResponse = new ArrayList<GetLanguageResponse>();

		for (Language language : languages) {
			languagesResponse.add(new GetLanguageResponse(language.getId(), language.getName()));
		}

		return languagesResponse;
	}

	@Override
	public CreateLanguageRequest add(CreateLanguageRequest newLanguage) {
		Language language = modelMapper.map(newLanguage, Language.class);
		Optional<Language> oldLanguage = languageRepos.findByName(newLanguage.getName());

		if (newLanguage.getName().isEmpty()) {

			throw new RuntimeException("Proglamlama dili boş geçilemez");
		}
		if (oldLanguage.isPresent()) {
			throw new RuntimeException("Proglamlama dili zaten var");
		}
		languageRepos.save(language);
		return newLanguage;

	}

	@Override
	public UpdateLanguageResponse update(int id, UpdateLanguageRequest newLanguage) {
		Optional<Language> language = languageRepos.findById(id);
		if (language.isPresent()) {
			Language languageToUpdate = language.get();
			languageToUpdate.setName(newLanguage.getName());
			UpdateLanguageResponse languageResponse = modelMapper.map(languageToUpdate, UpdateLanguageResponse.class);
			languageRepos.save(languageToUpdate);
			return languageResponse;

		} else {

			throw new RuntimeException("Dil bulunamadı : " + id);
		}

	}

	@Override
	public void delete(int id) {
		Optional<Language> language = languageRepos.findById(id);
		if (language.isPresent()) {
			languageRepos.deleteById(language.get().getId());
		} else {

			throw new RuntimeException("Geçersiz id : " + id);
		}

	}

	@Override
	public FindByIdLanguageResponse findById(int languageId) {
		Optional<Language> language = languageRepos.findById(languageId);

		if (language.isPresent()) {
			FindByIdLanguageResponse languageResponse = modelMapper.map(language.get(), FindByIdLanguageResponse.class);
			return languageResponse;
		} else {

			throw new RuntimeException("Bu id ile kayıtlı dil yok : " + languageId);
		}
	}

}
