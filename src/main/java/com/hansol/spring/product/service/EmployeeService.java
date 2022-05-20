package com.hansol.spring.product.service;

import com.hansol.spring.product.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO findEmployeeById(int e_id);

    List<EmployeeDTO> getEmployeeList();

    EmployeeDTO insertEmployeeDTO(EmployeeDTO employeeDTO);

    EmployeeDTO updateEmployeeDTO(EmployeeDTO employeeDTO);

    void deleteEmployeeDTO(int e_id);
}
