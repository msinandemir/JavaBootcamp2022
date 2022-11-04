package kodlama.io.demo.repos.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.demo.entites.concretes.SubTechnology;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Integer>
{

}
