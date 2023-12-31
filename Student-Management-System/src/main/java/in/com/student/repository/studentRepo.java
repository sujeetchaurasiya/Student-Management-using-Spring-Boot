package in.com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.com.student.entity.Studententity;
@Repository
public interface studentRepo extends JpaRepository<Studententity,Integer> {

}
