package kodalamaIo.repos;

import java.util.List;

import kodalamaIo.entities.Course;

public interface CourseRepos {
	Course add(Course course);
	Course update(Course course);
	void delete(Course course);
	List<Course>getAllCourses();
}
