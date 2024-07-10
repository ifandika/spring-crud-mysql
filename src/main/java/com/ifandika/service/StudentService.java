package com.ifandika.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifandika.data.Response;
import com.ifandika.data.Student;
import com.ifandika.repository.StudentRepository;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * Tambah data ke database
     * @param student
     * @return
     */
    public Response addStudent(Student student) {
        studentRepository.save(student);
        return new Response(
            "Success add",
            200,
            new ArrayList<>()
        );
    }

    /**
     * Ambil semua data students
     * @return
     */
    public Response getStudents() {
        ArrayList<Object> arrayList = (ArrayList) studentRepository.findAll();
        return new Response(
            "Success get all student",
            200,
            arrayList
        );
    }

    /**
     * 
     * @param id
     * @param student
     * @return
     */
    public Response updateStudent(int id, Student student) {
        Response response = new Response();
        if(studentRepository.existsById(id)) {
            student.setId(id);
            studentRepository.save(student);
            response.setMessage("Success update");
            response.setCode(200);
            response.addStudent(studentRepository.findById(id));
        }
        else {
            response.setMessage("Failed update");
            response.setCode(400);
        }
        return response;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Response deleteStudent(int id) {
        Response response = new Response();
        if(studentRepository.existsById(id)) {
            Optional<Student> studentDeleted = studentRepository.findById(id);
            studentRepository.deleteById(id);
            response.setMessage("Success delete");
            response.setCode(200);
            response.addStudent(studentDeleted.get());
        }
        else {
            response.setMessage("Failed delete, Student id="+id+" not found");
            response.setCode(200);
        }
        return response;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Response getStudentById(int id) {
        Response response = new Response();
        if(studentRepository.existsById(id)) {
            Optional<Student> student = studentRepository.findById(id);
            response.setMessage("Success get student by id="+id);
            response.setCode(200);
            response.addStudent(student.get());
        }
        else {
            response.setMessage("Failed get student by id="+id+", because id not found");
            response.setCode(400);
        }
        return response;
    }
}
