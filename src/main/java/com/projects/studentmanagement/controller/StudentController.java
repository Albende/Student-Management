package com.projects.studentmanagement.controller;

import com.projects.studentmanagement.entity.Student;
import com.projects.studentmanagement.service.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@RestController
public class StudentController {
    private StudentServiceImpl studentServiceImpl;

    @GetMapping("/students")
    public List<Student> listStudents() {
        return studentServiceImpl.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student listStudentById(@PathVariable("id") Long id) {
        return studentServiceImpl.getStudentByID(id);
    }

    @PostMapping("/students/new")
    public Student createStudent(@RequestBody Student student) {
        return studentServiceImpl.saveStudent(student);
    }

    //implementing ResponseEntity
    @PutMapping("/students/update/{id}")
    public ResponseEntity<Object> updateStudents(@PathVariable("id") Long id, @RequestBody Student student) {
        studentServiceImpl.updateStudent(id, student);
        return new ResponseEntity<>("Student updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/students/delete/{id}")
    public ResponseEntity<Object> deleteStudentById(@PathVariable("id") Long id) {
        studentServiceImpl.deleteStudentByID(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);

    }

}
