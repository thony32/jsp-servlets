package net.java.hibernateapp.services;

import net.java.hibernateapp.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee save(Employee employee);

    void delete(Employee employee);

    List<Employee> findAll();

    Optional<Employee> findByCodeEmployee(Integer codeEmployee);

    List<Employee> findByCodeEmployeeOrLastNameOrFirstName(String search);

    Employee update(Employee employee);
}
