package com.example.FetchingData.Repository.repo;

import com.example.FetchingData.Model.StudentsDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends MongoRepository<StudentsDetail,Integer> {
}
