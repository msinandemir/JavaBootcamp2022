package kodalamaIo.repos;

import java.util.List;

import kodalamaIo.entities.Instructor;

public class JdbcInstructorRepos implements InstructorRepos{

	@Override
	public Instructor add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
		return instructor;
	}

	@Override
	public Instructor update(Instructor instructor) {
		System.out.println("Jdbc ile g�ncellendi: " + instructor.getFirstName() + " " + instructor.getLastName());
		return instructor;
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Jdbc ile silindi: " + instructor.getFirstName() + " " + instructor.getLastName());
	}

	@Override
	public List<Instructor> getAllInstructors() {
		System.out.println("Jdbc ile t�m e�itmenler getirildi");
		List<Instructor> instructors = null;
		return instructors;
	}

}
