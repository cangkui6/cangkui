package ynu.edu.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Tag(name = "HelloWorld服务")
public class HelloController {
    @GetMapping("/say/{name}")
    @Operation(summary = "这是一个根据姓名生成HelloWorld信息的方法")
    @Parameter(name = "name",description = "name",required = true,example = "小明")
    public String Say(@PathVariable String name){
        return "hello world!新世界!"+name+"!";
    }

}
