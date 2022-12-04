package com.example.department.service;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepo.save(department);
    }

    public Department findDepartment(Long departmentId) {
        log.info("Inside findDepartment method of DepartmentService");
        return departmentRepo.findByDepartmentId(departmentId);
    }
}
