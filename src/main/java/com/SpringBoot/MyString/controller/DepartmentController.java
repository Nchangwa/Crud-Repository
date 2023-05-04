package com.SpringBoot.MyString.controller;

import com.SpringBoot.MyString.entity.Department;
import com.SpringBoot.MyString.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"api/v1/mydepartments"})
public class DepartmentController {
    private DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        Department department1=departmentService.createDepartment(department);
        return new ResponseEntity<>(department1, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long userId){
        Department department=departmentService.getDepartmentById(userId);
        return new ResponseEntity<>(department, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments(){
        List<Department> departments=departmentService.getAllDepartments();
        return new ResponseEntity<>(departments,HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Department> updateDepartment(@RequestBody Department department, @PathVariable("id") Long departmentId){
        department.setId(departmentId);
        Department updatedDepartment=departmentService.updateDepartment(department);
        return new ResponseEntity<>(updatedDepartment, HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return new ResponseEntity<>("Departmenet deletede successfully!", HttpStatus.OK);
    }
}
