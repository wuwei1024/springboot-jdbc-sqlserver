package com.wuwei.controller;

import com.wuwei.entity.Result;
import com.wuwei.entity.Student;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wuwei.service.BaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 控制器Controller
 *
 * @author Wu Wei
 * @date 2017-8-8 17:53:21
 */
@RestController
@RequestMapping("/student")
public class Controller {

    @Resource
    private BaseService service;

    /**
     * 新增
     *
     * @param student
     * @return
     */
    @PostMapping("/addStudent")
    public Result addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }
    
    /**
     * 查询
     *
     * @return
     */
    @PostMapping("/findAllStudent")
    public Result findAllStudent() {
        return service.findAllStudent();
    }

    /**
     * 更新
     *
     * @param student
     * @return
     */
    @PostMapping("/updateStudent")
    public Result updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }
    
    /**
     * 删除
     *
     * @param id
     * @return
     */
    @PostMapping("/delStudentById")
    public Result delStudentById(@RequestParam("id") String id) {
        return service.delStudentById(id);
    }
}
