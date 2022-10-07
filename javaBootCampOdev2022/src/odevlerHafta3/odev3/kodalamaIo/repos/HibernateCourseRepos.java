package kodalamaIo.repos;

import java.util.ArrayList;
import java.util.List;

import kodalamaIo.entities.Category;
import kodalamaIo.entities.Course;
import kodalamaIo.entities.Instructor;

public class HibernateCourseRepos implements CourseRepos {
	List<Course> courses = new ArrayList<Course>();

	@Override
	public Course add(Course course) {
		System.out.println("Hibernate ile eklendi: " + course.getCourseName());
		return course;
	}

	@Override
	public Course update(Course course) {
		System.out.println("Hibernate ile güncellendi: " + course.getCourseName());
		return course;
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile silindi: " + course.getCourseName());
	}

	@Override
	public List<Course> getAllCourses() {
		System.out.println("Hibernate ile tüm kurslar getirildi");
		courses.add(new Course(1,"Java dersleri",new Category(1,"Java"), new Instructor(1,"Engin","Demirog"), -5));
		return courses;
	}

}
