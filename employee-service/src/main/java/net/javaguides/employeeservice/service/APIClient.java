package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:8080/api/departments/", name = "department-service")
public interface APIClient {

    @GetMapping("/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);

}
