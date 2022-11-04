package kodlama.io.demo.service.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import kodlama.io.demo.entites.concretes.Language;
import kodlama.io.demo.entites.concretes.SubTechnology;
import kodlama.io.demo.repos.abstracts.LanguageRepository;
import kodlama.io.demo.repos.abstracts.SubTechnologyRepository;
import kodlama.io.demo.service.abstracts.SubTechnologyService;
import kodlama.io.demo.service.dto.requests.CreateSubTechnologyRequest;
import kodlama.io.demo.service.dto.requests.UpdateSubTechnologyRequest;
import kodlama.io.demo.service.dto.responses.FindByIdSubTechnologyResponse;
import kodlama.io.demo.service.dto.responses.GetSubTechnologyResponse;
import kodlama.io.demo.service.dto.responses.UpdateSubTechnologyResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SubTechnologyServiceImpl implements SubTechnologyService {
	private final SubTechnologyRepository subTechnologyRepository;
	private final LanguageRepository languageRepository;
	private final ModelMapper modelMapper;

	@Override
	public GetSubTechnologyResponse add(CreateSubTechnologyRequest newSubTechnology) {
		SubTechnology subTechnology = new SubTechnology();
		Language language = languageRepository.findById(newSubTechnology.getLanguageId()).get();
		subTechnology.setName(newSubTechnology.getName());
		subTechnology.setLanguage(language);
		subTechnologyRepository.save(subTechnology);
		GetSubTechnologyResponse response = modelMapper.map(subTechnology, GetSubTechnologyResponse.class);
		return response;
	}

	@Override
	public List<GetSubTechnologyResponse> getAll() {
		List<SubTechnology> subTechnologies = subTechnologyRepository.findAll().stream().map(i -> i)
				.collect(Collectors.toList());
		List<GetSubTechnologyResponse> subTechnologyResponses = new ArrayList<GetSubTechnologyResponse>();
		for (SubTechnology subTechnology : subTechnologies) {
			subTechnologyResponses.add(new GetSubTechnologyResponse(subTechnology.getId(), subTechnology.getName(),
					subTechnology.getLanguage().getName()));
		}
		return subTechnologyResponses;

	}

	@Override
	public UpdateSubTechnologyResponse update(int id, UpdateSubTechnologyRequest newSubTechnology) {
		Optional<SubTechnology> subTechnology = subTechnologyRepository.findById(id);
		if (subTechnology.isPresent()) {
			SubTechnology subTechToUpdate = subTechnology.get();
			subTechToUpdate.setName(newSubTechnology.getName());
			subTechToUpdate.getLanguage().setId(newSubTechnology.getLanguageId());
			UpdateSubTechnologyResponse subTechResponse = modelMapper.map(subTechToUpdate,
					UpdateSubTechnologyResponse.class);
			subTechnologyRepository.save(subTechToUpdate);
			return subTechResponse;
		} else {
			throw new RuntimeException("Alt teknoloji bulunamadı : " + id);
		}
	}

	@Override
	public void delete(int id) {
		Optional<SubTechnology> subTechnology = subTechnologyRepository.findById(id);
		if (subTechnology.isPresent()) {
			subTechnologyRepository.deleteById(subTechnology.get().getId());
		} else {
			throw new RuntimeException("Geçersiz id : " + id);
		}
	}

	@Override
	public FindByIdSubTechnologyResponse findById(int subTechId) {
		Optional<SubTechnology> subTechnology = subTechnologyRepository.findById(subTechId);
		if (subTechnology.isPresent()) {
			FindByIdSubTechnologyResponse subTechResponse = modelMapper.map(subTechnology.get(),
					FindByIdSubTechnologyResponse.class);
			return subTechResponse;
		} else {

			throw new RuntimeException("Bu id ile kayıtlı alt teknoloji yok : " + subTechId);
		}
	}

}
