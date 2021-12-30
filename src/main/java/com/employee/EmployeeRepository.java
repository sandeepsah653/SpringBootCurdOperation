package com.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.employee.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

	//public List<Employee> findAllByOrderByLastNameAsc();
	
}
