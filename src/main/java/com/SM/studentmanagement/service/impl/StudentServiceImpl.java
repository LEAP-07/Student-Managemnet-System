package com.SM.studentmanagement.service.impl;
import java.util.List;

import com.SM.studentmanagement.entity.Address;
import com.SM.studentmanagement.repository.AddressRespository;
import com.SM.studentmanagement.repository.StudentRepository;
import com.SM.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;
import com.SM.studentmanagement.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {


    private StudentRepository studentRepository;
    private AddressRespository addressRespository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student){
        Address add = new Address();
        add = student.getAddress();
        add.setWholeAddress();
        student.setAddress(add);
        return studentRepository.save(student);
    }



    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);

    }
}
