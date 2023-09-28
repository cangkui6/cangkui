package ynu.edu;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ynu.edu.dao.IStudentDao;
import ynu.edu.entity.Student;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class StuDaoTest {
    @Resource
    private IStudentDao studentDao;

    @Test
    public void insertUser() {
        Student student = new Student();
        student.setStuName("小明");
        student.setStuPwd("123456");
        student.setStuAge(18);
        student.setStuSex(true);
        studentDao.save(student);
    }

    @Test
    public void loginUser() {
        Long stuId = 2L;
        String pwd = "123456";
        Student student = studentDao.findByStuIdAndStuPwd(stuId, pwd);
        System.out.println();
    }

    @Test
    public void delete() {
        Long stuId = 2L;
        String pwd = "123456";
        studentDao.removeStudentByStuIdAndStuPwd(stuId, pwd);
    }

    @Test
    public void updateUser() {
        Optional<Student> student = studentDao.findById(1L);
        if (student.isPresent()) {
            student.get().setStuName("小红");
            studentDao.save(student.get());
        }
    }
    @Test
    public void quaryUser(){
        List<Student> list = studentDao.findAllByStuAgeBetween(10,20);
    //    List<Student> list = studentDao
    }
}
