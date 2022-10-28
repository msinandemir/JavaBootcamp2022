package kodlama.io.demo.repos.abstracts;

import java.util.List;

import kodlama.io.demo.entites.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	Language add(Language language);
	Language update(Language language,int id);
	void delete(int languageId);
	Language findById(Language language);

}
