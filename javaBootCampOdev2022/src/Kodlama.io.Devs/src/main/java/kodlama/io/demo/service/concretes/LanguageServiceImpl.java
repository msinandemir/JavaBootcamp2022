package kodlama.io.demo.service.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.demo.entites.concretes.Language;
import kodlama.io.demo.repos.concretes.InMemoryLanguageRepository;
import kodlama.io.demo.service.abstracts.LanguageService;

@Service
public class LanguageServiceImpl implements LanguageService {
	@Autowired
	InMemoryLanguageRepository repos;

	@Override
	public List<Language> getAll() {
		return repos.getAll();
	}

	@Override
	public Language add(Language language) {

		if (language.getName().isEmpty()) {
			throw new RuntimeException("Proglamlama dili boş geçilemez");
		}
		for (Language oldLanguage : getAll()) {
			if (language.getName().equals(oldLanguage.getName())) {
				throw new RuntimeException("Programlama dili zaten var");
			}
		}
		return repos.add(language);
	}

	@Override
	public Language update(Language language, int id) {
		List<Language> languages = getAll();
		for (Language oldLanguage : languages) {
			if (oldLanguage.getId() == id) {
				repos.update(language, getAll().indexOf(oldLanguage));
			} else {
				throw new RuntimeException("Dil bulunamadı");
			}
		}
		return language;
	}

	@Override
	public void delete(int id)  {
		List<Language> languages = getAll();
		for (Language language : languages) {
			if (language.getId() == id) {
				repos.delete(id);
				break;
			} else {
				throw new RuntimeException("Geçersiz id");
			}
		}

	}

	@Override
	public Language findById(int languageId) {
		List<Language> languages = getAll();
		for (Language languageById : languages) {
			if (languageId == languageById.getId()) {
				return languageById;
			} else {
				throw new RuntimeException("Bu id ile kayıtlı dil yok");
			}
		}
		return null;
	}

}
