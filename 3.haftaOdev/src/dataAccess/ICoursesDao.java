package dataAccess;
import java.util.List;

import entites.Course;
public interface ICoursesDao {
	List<Course> getAllCourses();
	void add(Course course);
}
