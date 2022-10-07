package kodalamaIo.service;

import java.util.List;

import kodalamaIo.core.log.BaseLogger;
import kodalamaIo.core.valid.CourseValid;
import kodalamaIo.entities.Course;
import kodalamaIo.repos.CourseRepos;

public class CourseService {
	CourseRepos courseRepos;
	CourseValid courseValid;
	List<Course> courses;
	List<BaseLogger> loggers;

	public CourseService(CourseRepos courseRepos, CourseValid courseValid, List<BaseLogger> loggers) {
		this.courseRepos = courseRepos;
		this.courseValid = courseValid;
		this.loggers = loggers;
	}

	List<Course> getAllCourses() {
		return courses = courseRepos.getAllCourses();
	}

	public Course add(Course course) throws Exception {
		courseValid.checkCourseName(getAllCourses(), course.getCourseName());
		courseValid.checkCoursePrice(course);
		courseRepos.add(course);
		for (BaseLogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		return course;
	}

	public Course update(Course course) throws Exception {
		courseValid.checkCourseName(getAllCourses(), course.getCourseName());
		courseValid.checkCoursePrice(course);
		courseRepos.update(course);
		for (BaseLogger logger : loggers) {
			logger.log(course.getCourseName());
		}
		return course;
	}
	
	public void delete(Course course) {
		courseRepos.delete(course);
		for(BaseLogger logger: loggers) {
			logger.log(course.getCourseName());
		}
	}
}
