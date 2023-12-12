package de.dibabo.employeemgmt.controller;

import de.dibabo.employeemgmt.entity.Employee;
import de.dibabo.employeemgmt.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }

    @GetMapping("/employees")
    public String showEmployeeList(Model model) {
        List<Employee> employees = employeeService.findEmployees();
        model.addAttribute("employees", employees);
        return "employee-list";
    }
}
