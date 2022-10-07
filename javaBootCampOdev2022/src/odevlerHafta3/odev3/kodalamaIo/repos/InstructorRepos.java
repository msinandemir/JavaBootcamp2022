package kodalamaIo.repos;

import java.util.List;

import kodalamaIo.entities.Instructor;

public interface InstructorRepos {
Instructor add(Instructor instructor);
Instructor update(Instructor instructor);
void delete(Instructor instructor);
List<Instructor>getAllInstructors();
}
