package com.SM.studentmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.SM.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
