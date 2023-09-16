package com.mh.test.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class StudentService {
    StudentRepository repository;
    @Autowired
    StudentService(StudentRepository studentRepository){
        this.repository = studentRepository;
    }
    public List<Student> getStudents(){
        return repository.findAll();
    }

    public void insertStudent(Student student) throws IllegalStateException{
        if(repository.existsById(student.getId())){
            throw new IllegalStateException("Student is exist : "+ student.getId());
        }
        repository.save(student);
    }

    @Transactional
    public void updateStudent(Long id, String name, Integer age, String email) {
        if(!repository.existsById(id)){
            throw new IllegalStateException("Student does not exist : "+ id);
        }
        Optional<Student> finded = repository.findById(id);
        if(finded.isPresent()){
            finded.get().setAge(age);
            finded.get().setName(name);
            finded.get().setEmail(email);
        }
    }

    public void deleteStudent(Long id) {
        if(!repository.existsById(id)){
            throw new IllegalStateException("Student does not exist : "+ id);
        }
        repository.deleteById(id);
    }
}
