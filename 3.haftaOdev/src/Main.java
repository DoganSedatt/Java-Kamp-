import java.util.ArrayList;
import java.util.List;

import businnes.CategoryManager;
import businnes.CourseManager;
import businnes.InstructorManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.ICategoryDao;
import dataAccess.ICoursesDao;
import dataAccess.InstructorDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;
import dataAccess.JdbcInstructorDao;
import entites.Category;
import entites.Course;
import entites.Instructor;
import logging.DatabaseLogger;
import logging.ILogger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Instructor egitmen1=new Instructor(1,"Engin","Demiroğ","Java 2022");
		Instructor egitmen2=new Instructor(2,"Sedat","Doğan","C#");
		InstructorDao instructorDao=new JdbcInstructorDao();
		List<ILogger> logList= new ArrayList<>();
		logList.add(new DatabaseLogger());
		logList.add(new MailLogger());
		//instructorDao.add(egitmen1);
		//instructorDao.add(egitmen2);
		//instructorDao.getAllInstructors();
		InstructorManager manager=new InstructorManager(instructorDao,logList);
		manager.add(egitmen1);
		manager.add(egitmen2);
		System.out.println("------------------------------------");
		/////////////////////////////////////////////////////////////////
		
		
		Course java=new Course(1,"Java",150,egitmen1);
		Course cCarp=new Course(2,"C#",150,egitmen1);
		ICoursesDao coursesDao=new HibernateCourseDao();
		CourseManager courseManager=new CourseManager(coursesDao,logList);
		courseManager.Add(cCarp);
		//coursesDao.getAllCourses();
		System.out.println("-----------------------");
		////////////////////////////////////////////////////////////////
		
		Category cat1=new Category(1, "Backend");
		Category cat2=new Category(2, "Frontend");
		ICategoryDao catDao=new HibernateCategoryDao();
		CategoryManager catManager=new CategoryManager(catDao,logList);
		catManager.add(cat1);
		catManager.add(cat2);
	}

}
