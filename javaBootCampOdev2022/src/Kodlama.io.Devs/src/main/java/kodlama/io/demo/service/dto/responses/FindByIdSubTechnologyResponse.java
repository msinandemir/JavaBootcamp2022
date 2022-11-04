package kodlama.io.demo.service.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindByIdSubTechnologyResponse {
	private int id;
	private String name;
	private int languageId;

}
