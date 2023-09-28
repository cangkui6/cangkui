package ynu.edu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import ynu.edu.entity.Student;
import ynu.edu.service.IStudentService;

@RestController
@RequestMapping(value = "/stu")
@Tag(name = " 学生服务接口")
public class StudentController {
    @Resource
    private IStudentService studentService;
    @PostMapping(value = "/login")
    @Operation(summary = "学生登录接口")
    @Parameters({
            @Parameter(name = "id",description = "学号",required = true,example = "1"),
            @Parameter(name = "pwd",description = "密码",required = true,example = "123456")
    })
    public Student login(@RequestParam Long id,@RequestParam String pwd){
        return studentService.login(id,pwd);
    }

    @PostMapping(value = "/register")
    @Operation(summary = "学生注册接口")
    @Parameter(name = "stu",description = "学生实体JSON",required = true)
    public Boolean Register(@RequestBody Student student){
        student.setStuId(null);
        return studentService.registerStudent(student);
    }

    @PutMapping(value = "/changePwd")
    @Operation(summary = "学生修改密码接口")
    @Parameters({
            @Parameter(name = "id",description = "学号",required = true,example = "1"),
            @Parameter(name = "oldPwd",description = "旧密码",required = true,example = "123456"),
            @Parameter(name = "newPwd",description = "新密码",required = true,example = "1234")
    })
    public Boolean UpdatePwd(@RequestParam Long id,@RequestParam String oldPwd,@RequestParam String newPwd){
        return studentService.updatePassword(id, oldPwd, newPwd);
    }

    @DeleteMapping(value = "/remove")
    @Operation(summary = "学生删除接口")
    @Parameters({
            @Parameter(name = "id",description = "学号",required = true,example = "1"),
            @Parameter(name = "pwd",description = "密码",required = true,example = "123456")
    })
    public Boolean Remove(@RequestParam Long id,@RequestParam String pwd){
        return studentService.deleteUser(id,pwd);
    }
}
