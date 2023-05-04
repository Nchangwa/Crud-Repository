package com.SpringBoot.MyString.service;

import com.SpringBoot.MyString.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);
    Department getDepartmentById(Long departmentId);
    List<Department> getAllDepartments();
    Department updateDepartment(Department department);
    void deleteDepartment(Long departmentId);
}
