package com.example.demo.Controller;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepo;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
	EmployeeRepo serviceRepository;
	@Autowired 
	ApiService service;
	 
	@PutMapping("/update")
	public String update(@RequestBody Employee d) {
		return service.updateEmp(d);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int id) {
		return service.deleteEmp(id);
	}
}
