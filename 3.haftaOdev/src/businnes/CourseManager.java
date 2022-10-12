package businnes;

import java.util.List;

import dataAccess.ICoursesDao;
import entites.Course;
import logging.ILogger;

public class CourseManager {
	private ICoursesDao coursesDao;
	private List<ILogger> loggers;//Birden fazla loglama yapmak için list kullandık.
	public CourseManager(ICoursesDao coursesDao, List<ILogger> logs) {
		this.coursesDao = coursesDao;
		this.loggers=logs;
	}
	public void Add(Course course) throws Exception {
		List<Course> kurslar=coursesDao.getAllCourses();
		for (Course courses : kurslar) {
			if(course.getName()==courses.getName()) {
				throw new Exception("Bu kurs daha önce eklenmiş");
			}
			else if(course.getPrice()<0) {
				throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
			}
		}
		coursesDao.add(course);
		for (ILogger log : loggers) {
			log.log(course.getName());
		}
	}
}
