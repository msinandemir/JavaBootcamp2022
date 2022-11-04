package kodlama.io.demo.repos.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.demo.entites.concretes.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer>{

	Optional<Language> findByName(String name);

}
