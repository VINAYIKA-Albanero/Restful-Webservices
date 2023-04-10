package com.example.FetchingData.Model;

import com.example.FetchingData.ENUMs.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")

public class StudentsDetail {
    @Id

    private  int id;
    private String Name;
    private int age;
    private Gender gender;
    private String city;
    private String college;


    public StudentsDetail(int id, String name, int age, Gender gender, String city, String college) {
        this.id = id;
        Name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
