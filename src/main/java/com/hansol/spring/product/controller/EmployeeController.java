package com.hansol.spring.product.controller;

import com.hansol.spring.product.config.BaseResp;
import com.hansol.spring.product.config.ResponseMessage;
import com.hansol.spring.product.config.StatusCode;
import com.hansol.spring.product.dto.EmployeeDTO;
import com.hansol.spring.product.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){this.employeeService=employeeService;}

    @GetMapping("/emp")
    public ResponseEntity getEmployeeList(){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK, ResponseMessage.READ_EMPLOYEE,employeeService.getEmployeeList()),HttpStatus.OK);
    }

    @GetMapping("/emp/{e_id}")
    public ResponseEntity getEmployeeByID(@PathVariable int e_id){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK, ResponseMessage.READ_EMPLOYEE_BY_EID,employeeService.findEmployeeById(e_id)),HttpStatus.OK);
    }

    @PostMapping("/test")
    public ResponseEntity insertEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.CREATED_EMPLOYEE,employeeService.insertEmployeeDTO(employeeDTO)),HttpStatus.OK);
    }

    @PutMapping("/test")
    public ResponseEntity updateTest(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.UPDATE_EMPLOYEE, employeeService.updateEmployeeDTO(employeeDTO)), HttpStatus.OK);
    }

    //test 삭제
    @DeleteMapping("/test/{e_id}")
    public ResponseEntity deleteTest(@PathVariable int e_id) {
        employeeService.deleteEmployeeDTO(e_id);
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.DELETE_EMPLOYEE, employeeService.getEmployeeList()), HttpStatus.OK);
    }
}