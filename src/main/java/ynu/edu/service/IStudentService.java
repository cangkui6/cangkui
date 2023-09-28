package ynu.edu.service;

import ynu.edu.entity.Student;

public interface IStudentService {
    public Student login(Long id,String pwd);
    public Boolean registerStudent(Student student);
    public Boolean updatePassword(Long id,String oldPwd,String newPwd);
    public Boolean deleteUser(Long id,String pwd);
}
