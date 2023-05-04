package com.SpringBoot.MyString.repository;

import com.SpringBoot.MyString.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
