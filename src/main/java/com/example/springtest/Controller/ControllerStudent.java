package com.example.springtest.Controller;

import com.example.springtest.Entities.Student;
import com.example.springtest.Repository.StudentRepository;
import com.example.springtest.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller @AllArgsConstructor
public class ControllerStudent {

    private StudentRepository studentRepository;

    @GetMapping(path = "/index")
    public String students(Model model,@RequestParam (name = "page", defaultValue= "0") int page,
                                       @RequestParam (name = "size", defaultValue = "5") int size) {
        Page<Student> pagelistS = studentRepository.findAll(PageRequest.of(page,size));
        model.addAttribute("listS",pagelistS.getContent());
        model.addAttribute("pages",new int[pagelistS.getTotalPages()]);
        return "index";
    }
    @GetMapping(path = "/add")
    public String addS(Model model) {
        List<Student> st = Arrays.asList(
                new Student(null, "Mustapha", "bahbah", "aaa@aaa", 33, new Date()),
                new Student(null, "Abdellah", "bahbah", "aaa@aaa", 44, new Date()),
                new Student(null, "Houssine", "bahbah", "aaa@aaa", 43, new Date())
        );
        studentRepository.saveAll(st);
        return "add";
    }
}

