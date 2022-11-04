package kodlama.io.demo.service.abstracts;

import java.util.List;

import kodlama.io.demo.service.dto.requests.CreateSubTechnologyRequest;
import kodlama.io.demo.service.dto.requests.UpdateSubTechnologyRequest;
import kodlama.io.demo.service.dto.responses.FindByIdSubTechnologyResponse;
import kodlama.io.demo.service.dto.responses.GetSubTechnologyResponse;
import kodlama.io.demo.service.dto.responses.UpdateSubTechnologyResponse;

public interface SubTechnologyService {

	GetSubTechnologyResponse add(CreateSubTechnologyRequest sub);
	List<GetSubTechnologyResponse> getAll();
	UpdateSubTechnologyResponse update(int id, UpdateSubTechnologyRequest newSubTechnology);
	void delete(int id);
	FindByIdSubTechnologyResponse findById(int id);
}
