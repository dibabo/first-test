package de.dibabo.employeemgmt.repositories;

import de.dibabo.employeemgmt.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
