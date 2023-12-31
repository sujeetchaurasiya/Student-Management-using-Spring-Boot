package in.com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.com.student.entity.Studententity;
import in.com.student.repository.studentRepo;

@Service
public class studentService {

	@Autowired
	private studentRepo repo;
	public void addStudent(Studententity s) {
		
		repo.save(s);
	}
	
	
	public List<Studententity> viewStudent() {
		return repo.findAll();
	}
	
	public Studententity editStudent(int id){
		Optional<Studententity> e = repo.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}
	
}
