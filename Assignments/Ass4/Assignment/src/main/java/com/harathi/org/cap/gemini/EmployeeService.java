package com.harathi.org.cap.gemini;

import java.util.List;

import org.springframework.stereotype.Service;

import com.harathi.org.cap.Employee;

@Service
public interface EmployeeService {

	List<Employee> deleteOneInventory(int id);

	List<Employee> updateOneEmployee(int id, Employee employee);

	List<Employee> addOneEmployee(Employee employee);

	Employee getEmployee(int id);

	List<Employee> getEmployee();

	
	
	
	
}
