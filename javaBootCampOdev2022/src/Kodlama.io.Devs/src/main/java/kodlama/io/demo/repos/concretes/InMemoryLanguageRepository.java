package kodlama.io.demo.repos.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.demo.entites.concretes.Language;
import kodlama.io.demo.repos.abstracts.LanguageRepository;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		this.languages = new ArrayList<Language>();
		languages.add(new Language(1,"deneme"));
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language add(Language language) {
		languages.add(language);
		return language;
	}

	@Override
	public Language update(Language language, int id) {
		languages.set(id, language);

		return language;
	}

	@Override
	public void delete(int languageId) {
		for(Language language:languages) {
			if(language.getId() == languageId) {
				languages.remove(language);
				break;
			}
			
		}
		
	
	}

	@Override
	public Language findById(Language language) {
		for (Language foundLanguage : languages) {
			if (language.getId() == foundLanguage.getId()) {
				return foundLanguage;
			} 
		}
		return null;
	}

}
