package com.github.ajayvigneshrs.student_ms.controller;

import com.github.ajayvigneshrs.student_ms.model.Student;
import com.github.ajayvigneshrs.student_ms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public Student getStudent(@RequestParam(value = "id",required=false) String id, @RequestParam(value = "name",required=false) String name) {
        if (id != null) {
            return studentRepository.findById(id);
        } else if (name != null) {
            return studentRepository.findByName(name);
        } else {
            return null;
        }
    }

    // @GetMapping("find_by_name")
    //public Student getStudentByName(@RequestParam(value = "name") String name) {
    //  return studentRepository.findByName(name);
    //}
}
