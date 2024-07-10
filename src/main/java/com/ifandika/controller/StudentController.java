package com.ifandika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifandika.data.Response;
import com.ifandika.data.Student;
import com.ifandika.service.StudentService;

@RestController
@RequestMapping(path = "/api/v1/student/")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "{id}")
    public Response getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(path = "all")
    public Response getStudents() {
        return studentService.getStudents();
    }

    @PostMapping(path = "add")
    public Response addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping(path = "update/{id}")
    public Response updateStudent(@PathVariable int id, @RequestBody(required = true) Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping(path = "delete/{id}")
    public Response deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
