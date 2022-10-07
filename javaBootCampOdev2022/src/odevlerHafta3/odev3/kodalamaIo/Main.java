package kodalamaIo;

import java.util.ArrayList;
import java.util.List;

import kodalamaIo.core.log.BaseLogger;
import kodalamaIo.core.log.DatabaseLogger;
import kodalamaIo.core.log.MailLogger;
import kodalamaIo.core.valid.CategoryValid;
import kodalamaIo.core.valid.CourseValid;
import kodalamaIo.entities.Category;
import kodalamaIo.entities.Course;
import kodalamaIo.entities.Instructor;
import kodalamaIo.repos.HibernateCourseRepos;
import kodalamaIo.repos.JdbcCategoryRepos;
import kodalamaIo.repos.JdbcInstructorRepos;
import kodalamaIo.service.CategoryService;
import kodalamaIo.service.CourseService;
import kodalamaIo.service.InstructorService;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category = new Category(1, "Java2");
		Instructor instructor = new Instructor(1, "Engin", "Demirog");
		Course course = new Course(1, "Java dersleri2", category, instructor, -10);

		List<BaseLogger> loggers = new ArrayList<BaseLogger>();
		loggers.add(new DatabaseLogger());
		loggers.add(new MailLogger());

		CategoryService categoryService = new CategoryService(new JdbcCategoryRepos(), new CategoryValid(), loggers);
		categoryService.add(category);

		CourseService courseService = new CourseService(new HibernateCourseRepos(), new CourseValid(), loggers);
		courseService.add(course);

		InstructorService instructorService = new InstructorService(new JdbcInstructorRepos(), loggers);
		instructorService.add(instructor);

	}
}