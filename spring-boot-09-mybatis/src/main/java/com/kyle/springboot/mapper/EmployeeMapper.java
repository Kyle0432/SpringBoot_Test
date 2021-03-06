package com.kyle.springboot.mapper;

import com.kyle.springboot.bean.Employee;

/**
 * @Mapper 或者 @MapperScan 将接口扫描装配到容器中
 */
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
