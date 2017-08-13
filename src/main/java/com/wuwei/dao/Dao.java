package com.wuwei.dao;

import com.wuwei.entity.Student;
import java.util.List;

/**
 * Data Access Layer
 *
 * @author Wu Wei
 * @date 2017-8-5 21:03:48
 */
public interface Dao {

    public int addStudent(Student student);

    public List<?> findAllStudent();

    public int updateStudent(Student student);

    public int delStudentById(long id);

}
