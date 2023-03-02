package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;

@Service
public class ApiService {
@Autowired
EmployeeRepo repository;

public Optional<Employee> getEmployee(int id){
	return repository.findById(id);
}

public String updateEmp(Employee e) {
	repository.save( e);
	return "UPADATED";
}

public String deleteEmp(int id) {
	repository.deleteById( id);
	return "Id Deleted";
}

public Page<Employee> dosortAndPage(int offset,int pageSize,String field){
	Pageable pageable=PageRequest.of(offset, pageSize,Sort.by( Direction.ASC,field));
	return repository.findAll(pageable);
}
}
