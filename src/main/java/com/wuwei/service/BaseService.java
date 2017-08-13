package com.wuwei.service;

import com.wuwei.entity.Result;
import com.wuwei.entity.Student;

/**
 * BaseService Layer
 *
 * @author Wu Wei
 * @date 2017-8-6 20:31:29
 */
public interface BaseService {

    public Result addStudent(Student student);
    
    public Result findAllStudent();

    public Result updateStudent(Student student);
    
    public Result delStudentById(String id);
}
