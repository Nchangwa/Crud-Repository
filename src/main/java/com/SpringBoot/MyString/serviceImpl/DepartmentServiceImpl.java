package com.SpringBoot.MyString.serviceImpl;

import com.SpringBoot.MyString.entity.Department;
import com.SpringBoot.MyString.repository.DepartmentRepository;
import com.SpringBoot.MyString.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        Optional<Department> optionalDepartment=departmentRepository.findById(departmentId);
        return optionalDepartment.get();
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department) {
        Department existingDepartment=departmentRepository.findById(department.getId()).get();
        existingDepartment.setDepartmentName(department.getDepartmentName());
        Department savedDepartment=departmentRepository.save(department);
        return savedDepartment;
    }

    @Override
    public void deleteDepartment(Long departmentId) {

    }
}
