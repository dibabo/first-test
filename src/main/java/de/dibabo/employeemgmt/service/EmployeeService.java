package de.dibabo.employeemgmt.service;

import de.dibabo.employeemgmt.entity.Employee;
import de.dibabo.employeemgmt.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }

    public List<Employee> findEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }
}
