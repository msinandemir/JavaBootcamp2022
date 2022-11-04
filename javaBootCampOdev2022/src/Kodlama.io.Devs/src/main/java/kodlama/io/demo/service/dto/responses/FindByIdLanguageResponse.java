package kodlama.io.demo.service.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindByIdLanguageResponse {

	private int id;
	private String name;
}
