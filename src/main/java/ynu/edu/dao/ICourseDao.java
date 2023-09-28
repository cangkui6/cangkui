package ynu.edu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ynu.edu.entity.Course;

@Repository
public interface ICourseDao extends CrudRepository<Course,String> {
}
