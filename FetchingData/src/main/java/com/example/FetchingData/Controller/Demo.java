package com.example.FetchingData.Controller;

import com.example.FetchingData.Model.StudentsDetail;
import com.example.FetchingData.Repository.repo.StudentRepository;
import com.example.FetchingData.Services.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Demo {
    @Autowired
    Connection connection;
    private StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public ResponseEntity<?> addStudentDetail (@RequestBody StudentsDetail student) {
        connection.setStudentRepository(student);
        return ResponseEntity.ok(student);

    }
    @GetMapping("/getStudent")
     public ResponseEntity<?>getStudentsDetail(){

        return ResponseEntity.ok(this.studentRepository.findAll());
    }





}






