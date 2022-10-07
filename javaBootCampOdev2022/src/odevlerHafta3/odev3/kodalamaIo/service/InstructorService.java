package kodalamaIo.service;

import java.util.List;

import kodalamaIo.core.log.BaseLogger;
import kodalamaIo.entities.Instructor;
import kodalamaIo.repos.InstructorRepos;

public class InstructorService {

	private InstructorRepos instructorRepos;
	List<BaseLogger> loggers;

	public InstructorService(InstructorRepos instructorRepos, List<BaseLogger> loggers) {
		this.instructorRepos = instructorRepos;
		this.loggers = loggers;
	}

	public Instructor add(Instructor instructor) {
		instructorRepos.add(instructor);
		for (BaseLogger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
		return instructor;
	}

	public Instructor update(Instructor instructor) {
		instructorRepos.update(instructor);
		for (BaseLogger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
		return instructor;
	}

	public void delete(Instructor instructor) {
		for (BaseLogger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
		instructorRepos.delete(instructor);

	}
}
