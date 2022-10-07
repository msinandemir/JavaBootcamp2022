package kodalamaIo.core.valid;

import java.util.List;

import kodalamaIo.entities.Course;

public class CourseValid {
	List<Course> courses;

	public void checkCourseName(List<Course> courses, String newCourseName) throws Exception {
		this.courses = courses;

		for (Course course : courses) {
			if (course.getCourseName().equals(newCourseName)) {
				throw new Exception("Ekelemeye �al��t���n�z kurs daha �nce eklenmi�");
			}
		}
	}

	public void checkCoursePrice(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyat� 0'dan az olamaz");
		}
	}

}
