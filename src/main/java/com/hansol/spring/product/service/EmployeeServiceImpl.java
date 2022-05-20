package com.hansol.spring.product.service;

import com.hansol.spring.product.dao.EmployeeDAO;
import com.hansol.spring.product.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }


    @Override
    public EmployeeDTO findEmployeeById(int e_id) {
        return employeeDAO.selectEmployeeDataById(e_id);
    }

    @Override
    public List<EmployeeDTO> getEmployeeList() {
        return employeeDAO.selectEmployeeData();
    }

    @Override
    public EmployeeDTO insertEmployeeDTO(EmployeeDTO employeeDTO) {
        employeeDAO.insertEmployeeData(employeeDTO);
        return employeeDTO;
    }

    @Override
    public EmployeeDTO updateEmployeeDTO(EmployeeDTO employeeDTO) {
        EmployeeDTO existEmp = employeeDAO.selectEmployeeDataById(employeeDTO.getE_id());
        existEmp.setE_name(employeeDTO.getE_name());
        existEmp.setE_company(employeeDTO.getE_company());
        existEmp.setE_rank(employeeDTO.getE_rank());
        existEmp.setE_phone(employeeDTO.getE_phone());
        employeeDAO.updateEmployeeData(existEmp);
        return existEmp;
    }

    @Override
    public void deleteEmployeeDTO(int e_id) {
        employeeDAO.deleteEmployeeData(e_id);
    }
}