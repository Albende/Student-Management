package com.projects.studentmanagement.service;

import com.projects.studentmanagement.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {
    //    public Collection<Student> getAllStudents();
    public List<Student> getAllStudents();

    public void deleteStudentByID(Long id);

    public Student getStudentByID(Long id);

    public Student updateStudent(Long id, Student student);

    public Student saveStudent(Student student);
}
