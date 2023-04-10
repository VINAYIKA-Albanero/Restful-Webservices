package com.example.FetchingData.Services;

import com.example.FetchingData.Model.StudentsDetail;
import com.example.FetchingData.Repository.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class Connection {
    @Autowired
    StudentRepository studentRepository;

    public void setStudentRepository(StudentsDetail student) {
        studentRepository.save(student);
    }


    public List<StudentsDetail> getStudentsDetail() {
        return studentRepository.findAll();
    }
}