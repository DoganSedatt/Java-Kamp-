package businnes;

import java.util.List;

import dataAccess.InstructorDao;
import entites.Instructor;
import logging.ILogger;

public class InstructorManager {
	private InstructorDao instructorDao;//İnterface değişkeni;
	private List<ILogger> loggers;//Birden fazla loglama yapmak için list kullandık.
	List<Instructor> egitmen;
	public InstructorManager(InstructorDao instructorDao, List<ILogger> logs) {
		this.instructorDao = instructorDao;
		this.loggers=logs;
		//This demek bu class demek.Yani classın içindeki loggers'ı ifade ediyor. Parametre verilen logs listini classdaki loggers'a atıyor.
	}
	
	public void add(Instructor instructorr){
		instructorDao.add(instructorr);
		for (ILogger log : loggers) {
			log.log(instructorr.getName()+" "+instructorr.getLastName());
		}
	}
	public void ListEgitmen() {
		System.out.println(instructorDao.getAllInstructors());		
	}
}
