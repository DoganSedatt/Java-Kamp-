package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entites.Course;

public class HibernateCourseDao implements ICoursesDao{
	List<Course> courses=new ArrayList<>();
	@Override
	public List<Course> getAllCourses() {
		for (Course course : courses) {
			System.out.println("Kurs adı:"+ course.getName()+ " Fiyat: "+ course.getPrice());
			//System.out.println("Kurs sayısı:"+courses.size());
		}
		return courses;
	}

	@Override
	public void add(Course course) {
		System.out.println(course.getName()+" kursu Hibernate ile veritabanına eklendi");
		courses.add(course);	
	}

}
