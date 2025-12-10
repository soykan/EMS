package com.soykan.ems.Controller;

import com.soykan.ems.Entity.Employee;
import com.soykan.ems.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/employee")
class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/deneme")
    public String deneme() {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setEmail("john@john.com");
        employeeService.addEmployee(employee);

        return employeeService.getAll().getFirst().getName();
    }
}
