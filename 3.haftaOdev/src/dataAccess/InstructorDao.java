package dataAccess;

import java.util.List;

import entites.Instructor;

public interface InstructorDao {
	List<Instructor> getAllInstructors();
	void add(Instructor instructor);
}
