package ynu.edu.dao;

import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ynu.edu.entity.Student;

import java.util.List;

@Repository
public interface IStudentDao extends CrudRepository<Student,Long> {
    Student findByStuIdAndStuPwd (Long id,String pwd);
    @Transactional
    void removeStudentByStuIdAndStuPwd (Long id,String pwd);

    List<Student> findAllByStuAgeBetween(Integer begin, Integer end);
  //  List<Student> Student void findAllByStuAgeBetween(Integer begin, Integer end);
}
