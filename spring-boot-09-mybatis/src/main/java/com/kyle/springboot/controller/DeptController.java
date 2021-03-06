package com.kyle.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kyle.springboot.bean.Department;
import com.kyle.springboot.bean.Employee;
import com.kyle.springboot.mapper.DepartmentMapper;
import com.kyle.springboot.mapper.EmployeeMapper;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    @Transactional
    public Department insertDept(Department department) {
        departmentMapper.insertDept(department);
        System.err.println("Inserted successfully");
        System.err.println("---> 1/0 = " + (1 / 0));
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }


}
