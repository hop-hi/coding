package com.mh.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> get(){
        return studentService.getStudents();
    }

    @PutMapping
    public void save(@RequestParam(name="id") Long id,
                     @RequestParam(name="name") String name,
                     @RequestParam(name="age") Integer age,
                     @RequestParam(name="email") String email
                     ) {
        studentService.insertStudent(new Student(id,name,age,email));
    }

    @PostMapping("/{id}/")
    public void update(@PathVariable(name="id") Long id,
                     @RequestParam(name="name") String name,
                     @RequestParam(name="age") Integer age,
                     @RequestParam(name="email") String email
    ) {
        studentService.updateStudent(id,name,age,email);
    }

    @DeleteMapping("/{id}/")
    public void update(@PathVariable(name="id") Long id) {
        studentService.deleteStudent(id);
    }
}
