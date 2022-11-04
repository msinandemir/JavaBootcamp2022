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

import kodlama.io.demo.service.concretes.SubTechnologyServiceImpl;
import kodlama.io.demo.service.dto.requests.CreateSubTechnologyRequest;
import kodlama.io.demo.service.dto.requests.UpdateSubTechnologyRequest;
import kodlama.io.demo.service.dto.responses.FindByIdSubTechnologyResponse;
import kodlama.io.demo.service.dto.responses.GetSubTechnologyResponse;
import kodlama.io.demo.service.dto.responses.UpdateSubTechnologyResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/subtehnologies")
public class SubTechnologiesController {
	private final SubTechnologyServiceImpl service;

	@GetMapping
	public List<GetSubTechnologyResponse> getAllSubTechnologies() {
		return service.getAll();
	}

	@PostMapping
	public GetSubTechnologyResponse add(CreateSubTechnologyRequest subTechnology) {
		return service.add(subTechnology);
	}

	@PutMapping("/{subTechId}")
	public UpdateSubTechnologyResponse update(@PathVariable int subTechId,
			@RequestBody UpdateSubTechnologyRequest newSubTechnology) {
		return service.update(subTechId, newSubTechnology);
	}

	@DeleteMapping("/{subTechId}")
	public void delete(@PathVariable int subTechId) {
		service.delete(subTechId);
	}

	@GetMapping("/{subTechId}")
	public FindByIdSubTechnologyResponse findById(@PathVariable int subTechId) {
		return service.findById(subTechId);
	}

}
