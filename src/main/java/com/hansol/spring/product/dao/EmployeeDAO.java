package com.hansol.spring.product.dao;

import com.hansol.spring.product.dto.EmployeeDTO;

import java.util.List;

//데이터와 연결하는 역할을 하는 인터페이스
public interface EmployeeDAO {
    EmployeeDTO selectEmployeeDataById(int e_id);

    List<EmployeeDTO> selectEmployeeData();

    void insertEmployeeData(EmployeeDTO employeeDTO);

    void updateEmployeeData(EmployeeDTO employeeDTO);

    void deleteEmployeeData(int e_id);

}
