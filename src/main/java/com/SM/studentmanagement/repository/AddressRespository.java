package com.SM.studentmanagement.repository;
import com.SM.studentmanagement.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRespository extends JpaRepository<Address , Long> {
}
