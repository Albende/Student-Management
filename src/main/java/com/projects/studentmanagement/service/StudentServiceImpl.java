package com.projects.studentmanagement.service;

import com.projects.studentmanagement.entity.Student;
import com.projects.studentmanagement.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentByID(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentByID(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        studentRepository.deleteById(id);
        student.setId(id);
        return studentRepository.save(student);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
