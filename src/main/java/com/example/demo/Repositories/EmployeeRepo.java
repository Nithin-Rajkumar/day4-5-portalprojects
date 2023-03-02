package com.example.demo.Repositories;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
 
	
}
