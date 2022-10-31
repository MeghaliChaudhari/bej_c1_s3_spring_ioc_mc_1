package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class EmpConfig {

    @Bean("emp")
    public Employee getEmployee(){
        Employee employee = new Employee(getDepartment());
        employee.setEmpId(1);
        employee.setEmpName("Megha");
        employee.setEmpSalary("80000");
        return employee;
    }

    @Bean
    public Department getDepartment(){
        return  new Department(1,"Finance");
    }
}
