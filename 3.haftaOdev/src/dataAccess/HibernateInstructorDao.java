package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entites.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	private List<Instructor> instructors=new ArrayList<>();
	@Override
	public List<Instructor> getAllInstructors() {
		for (Instructor instructor : instructors) {
			System.out.println("Eğitmen:"+ instructor.getName()+" "+ instructor.getLastName());
		}
		return instructors;
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen "+ instructor.getName()+" "+instructor.getLastName()+" Hibernate ile veritabanına eklendi" );
		instructors.add(instructor);
		
	}

}
