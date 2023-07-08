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
        Address address = new Address();
        address.setStreet(student.getAddress().getStreet());
        address.setPostal_code(student.getAddress().getPostal_code());
        address.setCity(student.getAddress().getCity());
        address.setState(student.getAddress().getState());
        addressRespository.save(address);
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
