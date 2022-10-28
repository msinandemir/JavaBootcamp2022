package kodlama.io.demo.service.abstracts;

import java.util.List;


import kodlama.io.demo.entites.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language add(Language language);
	Language update(Language language,int id);
	void delete(int id);
	Language findById(int languageById);

}
