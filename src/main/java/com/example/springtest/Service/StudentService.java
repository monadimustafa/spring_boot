package com.example.springtest.Service;

import com.example.springtest.Entities.Student;
import com.example.springtest.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StudentService {
  /*  public void addStudent(){
        studentRepository.save(new Student("Mustapha","bahbah","aaa@aaa",33,new Date()));
       *//* List<Student> st = Arrays.asList(),
                                         new Student(1L,"Mustapha","bahbah","aaa@aaa",33,new Date()),
                                         new Student(3L,"Abdellah","bahbah","aaa@aaa",44,new Date()),
                                         new Student(4L,"Houssine","bahbah","aaa@aaa",43,new Date()));
        studentRepository.save(st);*//*
    }
    public List ListStudent(){
        List<Student> listesS = studentRepository.findAll();
        return listesS;
    }*/

}
