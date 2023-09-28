package ynu.edu.service.impl;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import ynu.edu.dao.IStudentDao;
import ynu.edu.entity.Student;
import ynu.edu.service.IStudentService;
@Service

public class StudentService implements IStudentService {
    @Resource
    private IStudentDao studentDao;

    @Override
    public Student login(Long id,String pwd){
        try {
            Student student = studentDao.findByStuIdAndStuPwd(id, pwd);
            return student;
        }
        catch (Exception e){
            return new Student();
        }
    }
@Override
public Boolean registerStudent(Student student){
        try {
            studentDao.save(student);
        }
        catch (Exception e){
            return false;
        }
        return true;
}
/*    @Override
    public Boolean registerStudent(Student student) {
        try{
            Student student = studentDao.findByStuIdAndStuPwd(id,pwd);
            if (student==null)
                return false;
        }catch (Exception exception){
            return false;
        }
        return true;
    }
*/
    @Override
    public Boolean updatePassword(Long id, String oldPwd, String newPwd) {
        try {
            Student student = studentDao.findByStuIdAndStuPwd(id,oldPwd);
            student.setStuPwd(newPwd);
            studentDao.save(student);
        }
        catch (Exception e){
            return false;
        }
        return true;
        }

    @Override
    public Boolean deleteUser(Long id, String pwd) {
        try {
            studentDao.removeStudentByStuIdAndStuPwd(id, pwd);
        }catch (Exception exception){
            return false;
        }
        return true;
    }
}
